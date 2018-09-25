package com.chinni.basics.methods_types;

class A{}
class  Example
{
	static void m1(A a){
	System.out.println("m1");
	}

	static A m2(String s){
	System.out.println("m2");
	return new A();	
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		m1(a1);
		m2("chinni");
		A a2 =m2("achari");
		System.out.println("Hello World!");
	}
}
