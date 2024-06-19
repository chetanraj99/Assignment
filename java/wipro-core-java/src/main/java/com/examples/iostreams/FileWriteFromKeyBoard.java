package com.examples.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteFromKeyBoard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fout = new FileOutputStream("d://data/output1.txt");
		Scanner sc = new Scanner(System.in);
		
		String line;
		while(true) {
			line = sc.nextLine();
			if(line.equals("#")) {
				break;
			}
			fout.write(line.getBytes());

		}
		System.out.println("Data written to file");
	}

}
