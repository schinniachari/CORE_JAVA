package com.chinni.exception_handling.exception_handling;

public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			System.out.println("in try");
			System.out.println(m1());
			System.out.println("in try ending");
		} catch (ArithmeticException e) {
			System.out.println("in catch");
		}
		System.out.println("main end");
	}// main

	private static int m1() {
		System.out.println(10 / 0);
		System.out.println("after try catch finally");
		return 10;
	}
}// class 