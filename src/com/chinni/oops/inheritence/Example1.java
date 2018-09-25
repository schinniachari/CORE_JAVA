package com.chinni.oops.inheritence;
class Example1{
	static int a=m1();

	static {
		System.out.println("Example SB");
	}

	int x=m2();

	{
		System.out.println("Example NSB");
	}

	Example1(){
	   	System.out.println("Example cons");
	}
	
	static int m1(){
			System.out.println("Example SV is created");
			return  10;
	}

	int m2(){
			System.out.println("Example NSV is created");
	 return 20;
	}
	void abc(){
			System.out.println("Example ABC");
	}
	 	void bbc(){
			System.out.println("Example BBC");
	}
 
}
		