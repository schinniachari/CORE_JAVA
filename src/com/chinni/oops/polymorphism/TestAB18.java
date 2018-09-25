package com.chinni.oops.polymorphism;
class TestAB18{
	public static void main(String[] args) 
	{
		B18 b1=new B18();
		B18 b2=new B18();
		A18 a1=new A18();
		b1.a=15;
		b2.a=18;
		b1.x=16;
		b2.x=19;

		b1.m4();
		b2.m4();
		b1.m3();
		b2.m3();

			System.out.println(b1.a);
			System.out.println(a1.a);
			System.out.println(b1.x);
			System.out.println(a1.x);	  
	}
}
