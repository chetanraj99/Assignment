package com.examples.iostreams;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dirPath ="d://";
		Path dir = Paths.get(dirPath);
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
			
			for(Path entry:stream) {
				System.out.println(entry.getFileName());
			}
			
		}
		catch(Exception e) {
			
		}

	}

}
