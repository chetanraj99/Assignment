package com.examples.iostreams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class NIOFileWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("d://data/niodata.txt");
		try {
			Files.write(path,  Arrays.asList("hello world","welcome to nio"));
			System.out.println("data written");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
