package com.chinni.iostream; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream; 

public class OISCheck { 
	public static void main(String[] args) 
			   throws FileNotFoundException,   IOException, ClassNotFoundException { 
		ObjectInputStream ois =
				new ObjectInputStream(
						new FileInputStream("studentinfo.ser"));
		 Student s1=(Student)ois.readObject();
		 
	 System.out.println("s1 "+s1);
	} 
} 