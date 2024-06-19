package com.examples.iostreams;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter writer = new FileWriter("d://data/filewrite.txt");
		writer.write("Hello, world \n");
		writer.write("This is writer example \n");
		writer.write("Java I/O is best for IO Streams \n");
		
		writer.write("Another line added to previous content \n");
		writer.close();
		System.out.println("Data written to fiels");
		

	}

}
