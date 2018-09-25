package com.chinni.multi_threading.practice;
class AddStaticTest {
	public static void main(String[] args) 
	{
		AddStatic a=new AddStatic();
		new AddStaticMyThread1(a).start();
		new AddStaticMyThread2(a).start();
 	}
}
