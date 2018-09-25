package com.chinni.basics.non_static_members;
class ObjPool 
{         int x=10;
           int y=20;
	ObjPool(){	System.out.println("in no args");
	 int x=30;
       int y=40;
	}
	public static void main(String[] args) 
	{ 
		ObjPool e1= new ObjPool();
		ObjPool e2= new ObjPool();
		System.out.println(e1.x);
 		System.out.println(e1);
		System.out.println(e2);
	}
}
