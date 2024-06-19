package com.examples.iostreams;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader file = new FileReader("d://data/fileinput.txt");
		int character;
		while((character = file.read())!=-1) {
			System.out.print((char) character);
		}
		file.close();

	}
}
