package com.chinni.basics.non_static_members;
class  NsMethMem
{    int x=30;
     int y=40;
	void m1(){
		int x=10;
		int y=20;
		System.out.println("im m1 method");
			System.out.println(x);
				System.out.println(y);
				m2();
	}

	void m2(){
	System.out.println(this.x );
	System.out.println(this.y);
	m1();
	}
	public static void main(String[] args) 
	{
		 NsMethMem e1=new  NsMethMem();
       e1.m1();
	}
}
