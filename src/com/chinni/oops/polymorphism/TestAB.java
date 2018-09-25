package com.chinni.oops.polymorphism;
class TestAB{
	public static void main(String[] args) 
	{
		 B b=new B();
		 b.m1();
		 b.m2();
//		 b.m3();
//		 b.m3("chinni");
//		 b.m3(45.3f,39);

		 A a =new B();
		 a.m1();
		 a.m2();
//		 a.m3();
//		 a.m3("chinni");
//		 a.m3(334.34f,98);
 	}
}
