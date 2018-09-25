package com.chinni.basics.non_static_members;
class Exa1 
{
	static {
		System.out.println("in static block");
	Exa1 e=new Exa1();
	}

	Exa1(){
System.out.println("in cons");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
