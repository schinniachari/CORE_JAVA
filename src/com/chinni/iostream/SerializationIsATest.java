package com.chinni.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationIsATest {

	public static void main(String[] args)
			                     throws FileNotFoundException, IOException {
		
		SerializationIsASub sias=new SerializationIsASub();
		System.out.println("\n after object creation \n");
		ObjectOutputStream oos=new ObjectOutputStream(
				new FileOutputStream("ISA.ser") );
 
		oos.writeObject(sias);
		System.out.println(sias);
	}
}