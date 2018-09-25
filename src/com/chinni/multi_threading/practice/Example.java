package com.chinni.multi_threading.practice;
class Example 
{	
	static{
		Thread th= Thread.currentThread();
		System.out.println("curently running thread is::"+th.getName())	;
	} 
	static void m1(){
		 Thread th= Thread.currentThread();
		System.out.println(" im m1() is executing"+th.getName());
	}
}
