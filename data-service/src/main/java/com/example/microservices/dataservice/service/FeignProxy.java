package com.example.microservices.dataservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.microservices.dataservice.model.CommentsDto;

@FeignClient(name="COMMENT-SERVICE/comments")
public interface FeignProxy {
	
	@GetMapping("/postid/{pid}")
	public List<CommentsDto> getCommentsByPid(@PathVariable int pid);
	
	@GetMapping("/port")
	public String getPort();

}
