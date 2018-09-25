package com.chinni.basics.non_static_members;
class Exa{
	void m1(){
		System.out.println("m1 start");
		m1();
		System.out.println("m1 end000");
	}
	public static void main(String[] args) 
	{
		System.out.println("main statrt");
		Exa e=new Exa();
		System.out.println("obj is created");
		e.m1();
		System.out.println("main end");
	}
	int x=m2();
	int m2(){
		
		System.out.println("NSV x");
		return 50;
	}
	
	Exa(){
		System.out.println("cons start");
		System.out.println("Hello World!");
	}
}
