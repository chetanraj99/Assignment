package com.examples.iostreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestPersonSerializeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("kumar","chennai");
		System.out.println(p);
		// ObjectInputStream ---> reading the stream
		// ObjectOutputStream---> writing the stream
		
		try(ObjectOutputStream outstream = 
				new ObjectOutputStream(new FileOutputStream("d://data/objectfile.txt"))){
			
			
			outstream.writeObject(p);
			System.out.println("Person object data is written to file...");
			
		}
		catch(Exception e) {
			
		}

	}

}
