package com.chinni.oops.inheritence;
class B2 extends A2 {
	int x=30;
	int y=40;
	
	void m2(){
	 System.out.println(x);
	 System.out.println(y);	
	}
	public static void main(String[] args) 
	{
		B2 b1=new B2();
		B2 b2=new B2();
		
		b2.x=50;
		b2.y=60;
		b1.m1();
		b1.m2();
		System.out.println();
		b2.m1();
		b2.m2();
		System.out.println("Hello World!");
	}
}
