package com.chinni.oops.polymorphism;
class D extends C{
	public static void main(String[] args)	{
		//System.out.println("Hello World!");
	 C d=new D();
		d.m3();
	 }				 
	void m1(){
		System.out.println("in D m1()");
	}
}