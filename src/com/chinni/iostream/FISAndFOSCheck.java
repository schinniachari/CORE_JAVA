package com.chinni.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISAndFOSCheck {

	public static void main(String[] args) throws IOException {
		System.out.println("file stream is started");
		FileInputStream fis = new FileInputStream("chinni.txt");
		FileOutputStream fos = new FileOutputStream("des.txt");
		int i;
		while ((i = fis.read()) != (-1)) {
			fos.write(i);
			System.out.println(i);
		}
		System.out.println("file streaming is done");
	}

}
