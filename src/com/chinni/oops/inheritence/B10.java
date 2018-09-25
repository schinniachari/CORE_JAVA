package com.chinni.oops.inheritence;
class B10 extends A10{
	int x=30;
	int y=40;
	void m2(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
		System.out.println(super.y);
	}
	void m3(){
		x=50;
		y=60;
		 super.x=70;
		 super.y=80;
	}
}
