package com.examples.iostreams;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyBoardToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter # to stop");
		
		FileWriter writer = new FileWriter("d://data/output.txt");
		String line;
		while(true) {
			line=sc.nextLine();
			if(line.equals("#")) {
				break;
			}
			writer.write(line+ System.lineSeparator());
		}
		System.out.println("Data Written to File");
		writer.close();
		sc.close();
	}

}
