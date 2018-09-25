package com.chinni.basics.non_static_members;
class MainClassLoad
{
	static int a=m1();
	static {
		System.out.println("Example SB");
	}
	static int m1(){
		System.out.println("ExampleSV");
	return 50;
	}
	
	public static void main(String[] args)  {
 		System.out.println("Example MAIN");
	}
	static void m2(){
				System.out.println("Example m2 meth");
}
MainClassLoad(){
		System.out.println("Example cons");

}}