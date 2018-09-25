package com.chinni.oops.base_classes;
class Test1{
	static void m3(Object obj){
		  System.out.println("in static  block");
		if (obj instanceof Example)
		{		 
			System.out.println("in if block");
 	     Example e=(Example)obj;
		e.m1();
		}
		else if (obj instanceof Sample)
		{  
			System.out.println("in else if block");
 	     Sample s=(Sample)obj;
		s.m1();
		s.m2();
		}
	}
	public static void main(String[] args) { 
			 System.out.println("in main block");
			 Test1.m3(new Example()); 
			 Test1.m3(new Sample());
			 Test1.m3(new Object());
	}
}