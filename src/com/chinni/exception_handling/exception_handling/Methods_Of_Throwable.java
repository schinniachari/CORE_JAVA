package com.chinni.exception_handling.exception_handling;

public class Methods_Of_Throwable {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
		} catch (Exception e) {
			System.out.println("getMessage()  " + e.getMessage());
			System.out.println();
			e.printStackTrace();
			/*
			 * System.out.println(); //
			 * System.out.println("toString ()  "+e.toString());
			 */
		}

	}

}
