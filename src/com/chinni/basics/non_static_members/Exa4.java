package com.chinni.basics.non_static_members;
class Exa4
{
	static Exa4 e=new Exa4();
	Exa4(){
System.out.println("in cons block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
 	Exa4  e =new Exa4();
	}
}
