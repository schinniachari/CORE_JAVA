package com.chinni.oops.inheritence;
class TestAB10{
	public static void main(String[] args)	{
		B10 b1=new B10();
		A10 a1 =b1;
B10 b2=new B10();
		A10 a2 =b2;

		b1.m3();
		System.out.println(b1.x+"....."+b1.y); 
		System.out.println(a1.x+"....."+a1.y); 
																		  
		System.out.println(b2.x+"....."+b2.y); 
		System.out.println(a2.x+"....."+a2.y);
		System.out.println("Hello World!");
		b1.m1();
		b2.m1();
	   System.out.println("*************");
	   b1.m2(); 
	   b2.m2(); 	  
	}
}
