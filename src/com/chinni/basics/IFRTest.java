package com.chinni.basics;

class IFR 
{
	static int a=10;
	static {
		System.out.println("in static block");
		System.out.println( a);
//		System.out.println( b);
	}
	
//	static int b=20;
}

class IFRTest extends IFR{
	static int b=20;

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
};