package com.chinni.basics.non_static_members;
class CEIFR {
	static int a = 10;
	static {
		System.out.println("a::" + a);
//		System.out.println("b::" + b);
	}

	public static void main(String[] args) {
		System.out.println("a::" + a);
		System.out.println("b::" + b);
		System.out.println("Hello World!");
	}

	static int b = 20;
	/*
	 * static int getB(){ return b; }
	 */
}