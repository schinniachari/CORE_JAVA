package com.chinni.iostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSCheck {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("enter something");
		// created a student object
		Student s1 = new Student();
		s1.setCourse("java");
		s1.setFee(3700);
		s1.setSname("chinniachari");
		s1.setSno(10);
		// s1.setMarks(99);
		System.out.println("---------------");
		// display
		System.out.println(s1);
		// System.out.println("after student object");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentInfo.ser"));
		// System.out.println("after stream created");
		oos.writeObject(s1);
		// System.out.println("after write object ");
		System.out.println("student object is stored in studentinfo.ser");
	}
}