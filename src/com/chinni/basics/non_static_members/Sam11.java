package com.chinni.basics.non_static_members;
class Sam11 
{
	public static void main(String[] args) 
	{System.out.println("Hello World!");
		// System.out.println("a::"+a);
		 System.out.println("A::"+Exa11.a);

		 Exa11 e1=null;
		 System.out.println( "B::"+e1.b);

		 Exa11 e2=new Exa11();
		 System.out.println(" b::"+e2.b);
		Exa11.m1();
		System.out.println(e1.x);
		//System.out.println(Exa11.x);
	}
}
