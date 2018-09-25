package com.chinni.iostream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamCheck {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("chinni.txt");
		DataInputStream dis = new DataInputStream(input);
		int count = input.available();
		System.out.println("count is "+count);
		byte[] buffer = new byte[count];
		dis.read(buffer);
		for (byte bt : buffer) {
			char k = (char) bt;
			System.out.println(k + "-");
		}
	}
}
