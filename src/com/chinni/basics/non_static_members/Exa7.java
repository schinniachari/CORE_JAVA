package com.chinni.basics.non_static_members;
class Exa7{
	 int x=m2();
	int m2(){
	 System.out.println(" \n NSV x");
	 System.out.println("end of m1 ");return 10;
	 }
 
	{
    System.out.println("NSB start");
Exa7 e =new Exa7();
	System.out.println("end of NSB");
	}
	
	Exa7(){
System.out.println(" cons start");
System.out.println("end of cons block");
	}

	public static void main(String[] args) 
	{
		System.out.println("main start ");
		Exa7 e =new Exa7();
		System.out.println("end of main ");
	}
}
