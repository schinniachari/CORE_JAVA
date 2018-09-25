package com.chinni.basics.non_static_members;
class Exa5
{
  Exa5 e=new Exa5();
	Exa5(){
System.out.println("in cons block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
 	Exa5  e =new Exa5();
	}
}
