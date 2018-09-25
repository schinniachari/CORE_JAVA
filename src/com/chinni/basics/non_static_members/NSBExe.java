package com.chinni.basics.non_static_members;
class NSBExe 
{
	{
		System.out.println("in non static block1");
	}
	NSBExe(){
			System.out.println("in  no arg cons");
	}
		NSBExe(int a){
			System.out.println("in  parameter arg cons");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		 NSBExe e1=new NSBExe(); 
			System.out.println("after no arg cons"); 
    	 NSBExe e2=new NSBExe(10);
	}
	{
	System.out.println("in non static block 2");
	}
}
