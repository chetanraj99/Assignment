package com.examples.project.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.examples.project.model.Posts;
import com.examples.project.service.PostService;
import com.examples.project.service.PostServiceImpl;

public class PostsController {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		PostService service = new PostServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		System.out.println("Enter Title");
		String title = sc.next();
		System.out.println("Enter Author ");
		String author = sc.next();
		
		Posts post =new Posts(pid,title,author);
		service.insertPost(post);
		
		List<Posts> posts = service.displayPosts();
		
		posts.forEach(System.out::println);

	}

}
