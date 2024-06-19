package com.examples.iostreams;

import java.io.*;

public class FileReadingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("d://data/filewrite.txt");
		int content;
		
		while( (content = fis.read())!= -1) {
			System.out.print((char) content);
		}
		
		fis.close();
	}

}
