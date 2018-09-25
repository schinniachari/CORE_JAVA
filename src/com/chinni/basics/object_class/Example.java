package com.chinni.basics.object_class;

class Example {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Test t = new Test(5);
		System.out.println(t);
		Test t1 = new Test(6);
		System.out.println(t1);
	}
}

class Test {
	int x;

	Test(int x) {
		this.x = x;
	}

	public String toString() {
		return "" + x;
	}
};