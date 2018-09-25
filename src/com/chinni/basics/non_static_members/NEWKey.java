package com.chinni.basics.non_static_members;
class NEWKey 
{
	int x=10;
	int y=20;
	static NEWKey e=new NEWKey();
	{
	System.out.println("e value::"+e);
	//System.out.println(" e.x::"+e.x); 
	}
	NEWKey(){
	super();
	System.out.println( x);
	System.out.println(y);
	System.out.println("e value in cons::"+e);
	System.out.println("in cons after super");
	}

	public static void main(String[] args) 
	{
		System.out.println("in main");
	}
}
