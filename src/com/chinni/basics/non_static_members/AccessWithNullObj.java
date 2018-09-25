package com.chinni.basics.non_static_members;
class AccessWithNullObj 
{ 
	int x=10;
	static void m1(){
	System.out.println("in static method");
	}

	void m2(){
		System.out.println("in non static method");
	}

	public static void main(String[] args) {
		System.out.println("in main method");
		AccessWithNullObj  e = null;
		e.m1();
		//e.m2(); 
		//System.out.println(AccessWithNullObj.x);
			}
}