package com.chinni.basics.non_static_members;
class Exa3
{
	static Exa3 e=new Exa3();
	Exa3(){
System.out.println("in cons block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
 	Exa3  e =new Exa3();
	}
}
