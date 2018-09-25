package com.chinni.oops.construct.overloading;

class ThisRule4 {
	ThisRule4() {
		this(10);
		System.out.println("in no param");
	}

	ThisRule4(int a) {
		this(10, 20);
		System.out.println("in no param");
	}

	ThisRule4(int a, int b) {
		new ThisRule4(10, 20);
		System.out.println("in no param");
	}

	public static void main(String[] args) {
		ThisRule4 th = new ThisRule4();
		System.out.println("Hello World!");
	}
}
