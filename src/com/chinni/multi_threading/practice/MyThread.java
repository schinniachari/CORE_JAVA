package com.chinni.multi_threading.practice;
class MyThread extends Thread {
   	public void run() {
		System.out.println("in run MT method");
	try{	 Thread.sleep(7000);
 
			System.out.println("after try block");
		}
		catch(InterruptedException e){}
	} 
	public static void main(String[] args) throws InterruptedException {	   Thread.yield();
		System.out.println("in main method");
	   MyThread mt=new MyThread();
       mt.start();	
	   //mt.start();
	  Thread.sleep(100);
	   mt.interrupt();
  		System.out.println("after sleep");
		System.out.println("in main method1");	
	 	}
}
