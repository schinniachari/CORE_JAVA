package com.chinni.oops.inheritence;
//class Sample1 extends Example1{
 class Sample1  {
	static int a=m3();

	static {
		System.out.println("Sample1 SB");
	}

	int y=m4();

	{
		System.out.println("Sample1 NSB");
	}

	Sample1(){
	   	System.out.println("Sample1 cons");
	}
	
	static int m3(){
			System.out.println("Sample1 SV is created");
			return 30;
	}

	int m4(){
			System.out.println("Sample1 NSV is created");
			return 40;
	}
	void abc(){
			System.out.println("Sample1 ABC");
	}

	public static void main(String[] args) 
	{
 	Sample1 s=new Sample1();

		System.out.println("Hello World!");
	}
}
		