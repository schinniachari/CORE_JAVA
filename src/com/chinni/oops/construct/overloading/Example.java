package com.chinni.oops.construct.overloading;

class Example {
	int a;
	double b;
	int c;
	int var;

	Example() {
		this(10, 20, 30);
		System.out.println("no param cons");
	}

	Example(int q, double p) {
		this(q, p, 0);
		System.out.println("2 int param cons");
	}

	Example(int x, double y, int z) {
		this.a = x;
		this.b = y;
		this.c = z;
		System.out.println("3 int param cons");
	}

	public static void main(String[] args) {
		Example e1 = new Example(10, 20);
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(e1.c);
		System.out.println(e1.var);
	}
}
