package com.chinni.iostream; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Reader; 
public class DeSerializationIsATest {
Reader r=null;
	public static void main(String[] args) 
			                    throws FileNotFoundException, 
			                                 IOException,
			                                 ClassNotFoundException { 
		ObjectInputStream ois=new ObjectInputStream(
				new FileInputStream("ISA.ser") );
		System.out.println("after stream is created");
		SerializationIsASub s=(SerializationIsASub)ois.readObject();
		System.out.println(s); 
	} 
} 