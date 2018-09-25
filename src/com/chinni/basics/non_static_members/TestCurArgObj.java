package com.chinni.basics.non_static_members;
class TestCurArgObj 
{
	public static void main(String[] args) 
	{
		 CurArgObj e1=new 	 CurArgObj();
		 int q = 18;
		 	System.out.println("q is "+q );
		 e1.m1(q);
			System.out.println("q is "+q );
System.out.println( );			
		 CurArgObj e2=new 	 CurArgObj();
	 System.out.println("e2 is "+e2 );
	 e1.m2(e2);
	 System.out.println("e2 is "+e2 );
System.out.println( );
	 System.out.println("x is "+e2.x );
		e1.m3(e2);
		System.out.println("x is "+e2.x );
System.out.println( );
		System.out.println("x is "+e2.x);
		e1.m4(e2);
		System.out.println("e2is "+e2.x );
		System.out.println( );
	}
}
