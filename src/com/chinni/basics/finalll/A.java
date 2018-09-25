package com.chinni.basics.finalll;
final class   A{
 //class   A{
      final int a=20;
	public static void main(String[] args) 
	{	  final  int i=10;
		 	 final  int i1; 
        i1=20;
		//System.out.println(i);
		//System.out.println(i1);
//        System.out.println(a);
		System.out.println("Hello World!");
	}
	final void m1(){}
	final class D
	{
	};
}

class B 
{
 	 public static void main(String[] args) 
	{
	A a=new A();
	System.out.println(a.a);
	}
};
