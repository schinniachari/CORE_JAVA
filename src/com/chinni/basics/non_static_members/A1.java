package com.chinni.basics.non_static_members;
class A1 {
	void ma1(){
	B1 b=new B1();
	b.mb1(this);
	}
	void print(String msg){
		System.out.println(msg);
	 }
}
