package com.chinni.exception_handling.exception_handling;

class StringToInt {
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("in main");
		System.out.println("sum is" + (a + b));
	}
}
