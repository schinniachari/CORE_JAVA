package com.chinni.basics.finalll;
class Sample extends Example 
{
   @Override
	final  void m2(){System.out.println("in m2() final");}
	public static void main(String[] args) 
	{
			 Sample s=new Sample();
			 s.m1();
			 s.m2();
		System.out.println("Hello                     World!");
	}
}
