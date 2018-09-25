package com.chinni.basics.finalll;

class ClassLoadOrNot {
	static int a = 10;
	static int b = 20;
	static final int c = a + b;
	static {
		System.out.println("in ClassLoadOrNot SB");
	}
}