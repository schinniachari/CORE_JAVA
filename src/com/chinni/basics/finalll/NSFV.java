package com.chinni.basics.finalll;
class NSFV
{
	final int x=10;
	final int y;
	final int z;
 	{
		y=20; 
	}
 	NSFV(){
		z=30;
		 System.out.println(x );
		System.out.println( y);
		System.out.println( z);
 	}
	 NSFV(int a){
		 this();
	// z=4;

	 }
	public static void main(String[] args) 
	{
	   NSFV n=new NSFV();
		System.out.println("Hello World!");
	
	}
}
