package com.examples.iostreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadSeralizeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(ObjectInputStream instream = 
				new ObjectInputStream(new FileInputStream("d://data/objectfile.txt"))){
			
			
			Person p = (Person) instream.readObject();
			System.out.println(p);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}


	}

}
