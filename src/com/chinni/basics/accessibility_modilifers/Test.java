package com.chinni.basics.accessibility_modilifers;
class Test {
	public static void main(String[] args) 	{
	 int p = 10 ;
	 int q = m1();
	 System.out.println("after m1 method");
	 String s1="a";
	 String s2= new String("a");
	 Example e= new Example();
 System.out.println(e);
 //e=new Example();
    System.out.println(args[0]);
    System.out.println(p);
 System.out.println(q);
 System.out.println(s1);
System.out.println(s2);
	}
	static int m1(){
		System.out.println("in m1 method");
		return 60;  }
}