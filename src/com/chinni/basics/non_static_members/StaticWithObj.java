package com.chinni.basics.non_static_members;
class StaticWithObj 
{
	static int a=10;
	static int b=20;
	int x=30;
	int y=40;
 
	public static void main(String[] args) 
	{
		StaticWithObj e1=new StaticWithObj();
        StaticWithObj e2=new StaticWithObj();
       	System.out.println(a);
		a=30;
  		System.out.println(a);
		System.out.println(e2.a);
		System.out.println("Hello World!");
	}
}
