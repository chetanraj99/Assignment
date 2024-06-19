package com.example.microservices.dataservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.dataservice.model.CommentsDto;
import com.example.microservices.dataservice.model.Posts;
import com.example.microservices.dataservice.service.PostsService;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	Logger logger = LoggerFactory.getLogger(PostController.class);
	
	
	@Autowired
	PostsService service;
	
	@GetMapping("/commnetsPort")
	public String getPorts() {
		return service.getCommentsPort();
	}
	
	@GetMapping("/getComments/{pid}")
	@Retry(name = "retry-post", fallbackMethod = "getDummyComments")
	public List<CommentsDto> getCommentsForPid(@PathVariable int pid){
		logger.info("Comments server is called");
		return service.getAllComments(pid);
	}
	
	@GetMapping("/all")
	public List<Posts> showAllPosts(){
		return service.getAllPosts();
	}

	@PostMapping("/add")
	public Posts addPost(@RequestBody Posts post) {
		return service.addPost(post);
	}
	
	public List<CommentsDto> getDummyComments(Exception e) {
		logger.info("Fallback method is called");
		List<CommentsDto> list = new ArrayList<>();
		list.add(new CommentsDto(1111,"Dummy User-1", "Dummy Comment-1", 1001));
		list.add(new CommentsDto(222,"Dummy User-2", "Dummy Comment-2", 1002));
		list.add(new CommentsDto(3333,"Dummy User-2", "Dummy Comment-3", 1001));
		list.add(new CommentsDto(4444,"Dummy User-1", "Dummy Comment-4", 1002));
		list.add(new CommentsDto(5555,"Dummy User-5", "Dummy Comment-5", 1001));
		return list;
	}
	
}
