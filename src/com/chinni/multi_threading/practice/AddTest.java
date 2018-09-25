package com.chinni.multi_threading.practice;
class AddTest 
{
	public static void main(String[] args) 
	{
		Add a=new Add();
		new AddMyThread1(a).start();
		new AddMyThread2(a).start();
		System.out.println("Hello World!");
	}
}
