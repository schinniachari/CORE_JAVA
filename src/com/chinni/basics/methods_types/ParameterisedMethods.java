package com.chinni.basics.methods_types;

class ParameterisedMethods 
{ 
	static void m1(){
System.out.println("in m1");
}
	static void m1(int a){
System.out.println("in m1 int");
}
static void m1(double a){
System.out.println("in m1 double");
} 
	public static void main(String[] args) 
	{m1();
	m1(10);
	m1(10.0);
		System.out.println("Hello World!");
	}
}
