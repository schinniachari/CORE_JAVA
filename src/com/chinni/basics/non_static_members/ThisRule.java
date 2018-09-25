package com.chinni.basics.non_static_members;
class ThisRule 
{	
	public static void main(String[] args) 
	{
		ThisRule e1= new ThisRule();
	  e1.m1(e1);
		System.out.println("Hello World!");
		 	}
	void m1(ThisRule e){
		if (this==e)
		{System.out.println("in if block");
		}
	}
}
