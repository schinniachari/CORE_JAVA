package com.chinni.basics.non_static_members;
class Example 
{   int x=10;
	static void m1(){
		//System.out.println(x); 
	}
	
	void m2(){
	System.out.println(x); 
	}
	
	void m3(Example e){
	System.out.println(x); 
	System.out.println(e.x); 
	}
	static void m4(Example e){
//		System.out.println(x); 
		System.out.println(e.x);
	}
	public static void main(String[] args) 
	{
		Example e1=new Example();
		e1.m1(); 
		e1.m2();
	Example e2=new Example();
	e2.m3(e2);
	e1.m4(e2);
		System.out.println("Hello World!");
	}
}
