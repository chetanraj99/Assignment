package com.examples.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteExample {
	public static void main(String args[]) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("d://data/output.txt");
		String str = "Hello, welcome to file io operations";
		fout.write(str.getBytes());
		System.out.println("Data written to file");
		fout.close();
		
	}

}
