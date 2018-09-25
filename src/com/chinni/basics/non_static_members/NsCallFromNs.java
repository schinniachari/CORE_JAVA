package com.chinni.basics.non_static_members;
class NsCallFromNs {
	void m1(){
	System.out.println("in m1 meth");
	}

	void m2(){
   System.out.println("in m2 meth");
   m1();
}
 
static void m3(){
	System.out.println("in static m3");
//	m2();
}

public static void main(String[] args) {
	 NsCallFromNs e1=new  NsCallFromNs();
	 e1.m2();
	 m3();
	 	System.out.println("Hello World!");
	}}