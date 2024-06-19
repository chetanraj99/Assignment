package com.examples.project.service;

import java.sql.SQLException;
import java.util.List;

import com.examples.project.dao.PostsDao;
import com.examples.project.dao.PostsDaoImpl;
import com.examples.project.model.Posts;

public class PostServiceImpl implements PostService {
	
	PostsDao dao;
	
	public PostServiceImpl() {
		dao = new PostsDaoImpl();
	}

	@Override
	public Posts insertPost(Posts post) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return dao.insertPost(post);
	}

	@Override
	public List<Posts> displayPosts() throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return dao.displayPosts();
	}

	@Override
	public boolean deletePost(int pid) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return dao.deletePost(pid);
	}

}
