package com.chinni.multi_threading.practice;
class CurrentThread{

 	public static void main(String[] args) 
	{
    Thread th=Thread.currentThread();
	System.out.println("actually names of  main thread:::"+th.getName());
	System.out.println("actually priority of  main thread::"+th.getPriority());

	th.setName("main name changed");
	th.setPriority(10);

 	System.out.println("changed names of  main thread:::"+th.getName());
	System.out.println("changed priority of  main thread:::"+th.getPriority());
 	}
}


