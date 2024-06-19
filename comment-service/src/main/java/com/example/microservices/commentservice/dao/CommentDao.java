package com.example.microservices.commentservice.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.microservices.commentservice.model.Comments;

public interface CommentDao extends JpaRepository<Comments,Integer>{
	
	public List<Comments> findByPid(int pid);

}
