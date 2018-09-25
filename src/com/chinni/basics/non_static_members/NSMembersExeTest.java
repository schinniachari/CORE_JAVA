package com.chinni.basics.non_static_members;

class NSMembersExeTest  {
	int x=m1();
	NSMembersExeTest(){
		System.out.println("in test cons");
		}
	int m1(){
		System.out.println("in test m1()");
		return 10;
	}
	{
		System.out.println("in test NSblock");
	}
		
}
