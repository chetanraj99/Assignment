package com.examples.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.examples.project.model.Posts;
import com.examples.project.utilities.DbConnections;

public class PostsDaoImpl implements PostsDao {

	@Override
	public Posts insertPost(Posts post) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con = DbConnections.getDbConnection();
		String query = "insert into posts values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, post.getPid());
		pst.setString(2, post.getTitle());
		pst.setString(3, post.getAuthor());

		int k = pst.executeUpdate();

		return post;

	}

	@Override
	public List<Posts> displayPosts() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		List<Posts> posts= new ArrayList<>();
		Connection con = DbConnections.getDbConnection();

		Statement st = con.createStatement();

		
		String query = "select * from posts";
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			
			Posts post =new Posts(rs.getInt(1), rs.getString(2),rs.getString(3));
			posts.add(post);
			
		}

		rs.close();
		st.close();
		con.close();
		return posts;
	}

	@Override
	public boolean deletePost(int pid) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con = DbConnections.getDbConnection();
		// 3. Create the PreparedStatement Object
		String query = "delete posts where pid=?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, pid);

		// 6. Execute the query
		int k = pst.executeUpdate();
		if(k==0)
			return false;
		else
			return true;
		

	}

}
