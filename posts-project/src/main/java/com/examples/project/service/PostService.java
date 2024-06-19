package com.examples.project.service;

import java.sql.SQLException;
import java.util.List;

import com.examples.project.model.Posts;

public interface PostService {
	
	public Posts insertPost(Posts post) throws ClassNotFoundException, SQLException;
	public List<Posts> displayPosts() throws ClassNotFoundException, SQLException;
	public boolean deletePost(int pid) throws ClassNotFoundException, SQLException;
	
}
