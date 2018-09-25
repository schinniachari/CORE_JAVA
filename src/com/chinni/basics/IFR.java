package com.chinni.basics;

class IFR1 {
	static int a = 10;
	static {
		System.out.println("in static block");
		System.out.println(a);
		// System.out.println( b);
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
	// static int b=20;
}

class IFRTest1 extends IFR1 {
	static int b = 20;

};
