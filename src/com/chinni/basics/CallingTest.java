package com.chinni.basics;

class CallingTest {

	{
		int achari = 33;
		m2(achari);
		System.out.println("in m1() NSB");
	}

	int m2(int a) {
		System.out.println(a);
		return a;
	}

	int achari = m2(101);

	public static void main(String[] args) {
		{
			int a = 10, b = 20;
			System.out.println("started");
			System.out.println("10" == "10");

			int chinni = 32;
			System.out.println("in nonstatic block");
		}
		System.out.println("hi guysss");
		A3.mm();
	}
}

class A {
	static void m1() {
		CallingTest ct = new CallingTest();

		System.out.println("inside m1 class");
	}
}