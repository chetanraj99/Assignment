package com.example.microservices.dataservice.service;

import java.util.List;

import com.example.microservices.dataservice.model.CommentsDto;
import com.example.microservices.dataservice.model.Posts;

public interface PostsService {
	
	public List<Posts> getAllPosts();
	public Posts addPost(Posts post);
    public List<CommentsDto> getAllComments(int pid);
    public String getCommentsPort();

}
