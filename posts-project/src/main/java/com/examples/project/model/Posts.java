package com.examples.project.model;

public class Posts {
	
	int pid;
	String title;
	String author;
	public Posts() {
		
	}
	public Posts(int pid, String title, String author) {
		super();
		this.pid = pid;
		this.title = title;
		this.author = author;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Posts [pid=" + pid + ", title=" + title + ", author=" + author + "]";
	}
	

}
