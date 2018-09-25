package com.chinni.iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FISAnsFOSCheckTask {
	public static void main(String[] args) throws IOException {

		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		System.out.println("chinni achari");
		int ch = (char) System.in.read();
		System.out.println(ch);

		Scanner scn = new Scanner(System.in);
		// System.out.println(" enter the source file name ");
		FileInputStream fis = new FileInputStream("chinni.txt");
		FileOutputStream fos = new FileOutputStream("dec.txt");
		System.out.println("started");

		int data, onlyOnceInnerWhile = 0;
		while ((data = fis.read()) != (-1)) {
			sb1.append((char) data);
			while ((data == 10) && (onlyOnceInnerWhile == 0)) {
				onlyOnceInnerWhile = 10;
				String s = new String(sb1);
				if (s.contains("abc")) {
					sb2 = sb2.append(sb1);
				}
				sb1 = new StringBuffer();
			}
			onlyOnceInnerWhile = 0;
		}
		String s = new String(sb1);
		if (s.contains("abc"))
			sb2 = sb2.append(sb1);
		String s1 = new String(sb2);
		int len = s1.length();
		int i1 = 0;
		while (i1 < len) {
			fos.write(s1.charAt(i1));
			i1++;
		}
		System.out.println("copy is done ");
	}// main
}// class
