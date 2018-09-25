package com.chinni.oops.polymorphism;
class C extends B{ 
  void m1(){
		System.out.println(" C m1()");
	}
	void m2(){
		System.out.println("C m2()");
	}			
		void m3( ){
		System.out.println("B in m3()");
		this.m1();
		super.m1();
		this.m2();
		super.m2();
	}
 }