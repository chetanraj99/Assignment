package com.example.microservices.dataservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.microservices.dataservice.dao.PostsDao;
import com.example.microservices.dataservice.model.CommentsDto;
import com.example.microservices.dataservice.model.Posts;


@Service
public class PostServiceImpl implements PostsService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	FeignProxy proxy;
	
	
	private PostsDao dao;
	
	
	public PostServiceImpl(PostsDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public List<Posts> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Posts addPost(Posts post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

	@Override
	public List<CommentsDto> getAllComments(int pid) {
		// TODO Auto-generated method stub
		
		List<CommentsDto> data = restTemplate.getForObject("http://COMMENT-SERVICE/comments/postid/"+pid, List.class);
		
	//	List<CommentsDto> data=	proxy.getCommentsByPid(pid);
		return data;
	}

	@Override
	public String getCommentsPort() {
		// TODO Auto-generated method stub
		return proxy.getPort();
	}

}
