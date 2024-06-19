package com.examples.iostreams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NIOFileReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path path = Paths.get("d://data/input.txt");
		try {
			List<String> data = Files.readAllLines(path);
			data.forEach(System.out::println);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
