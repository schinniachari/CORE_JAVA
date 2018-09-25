package com.chinni.basics.static_members;

class  StaticExe
{ 
	static int a=m1();

	static int m1()
	{ 
	 System.out.println("a var is initialised");
	 return 10;
	 }

	 static{
		 System.out.println("SB1");
	 }

	 public static void main(String[] args) 
	{
		System.out.println("main is exe");
	}

static{
	System.out.println("SB2");
}

static int b=m2();

static int m2(){
	System.out.println("var b is initialised");
return 20;
}

static int m3(){
	System.out.println("m3 exe ");
	return 30;
}
}