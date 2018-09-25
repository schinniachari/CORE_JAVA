package com.chinni.multi_threading.practice;
class MyRunnable implements Runnable{
	public void run(){
		System.out.println("in run MR method");
	}

	public static void main(String[] args)  {
		MyRunnable mr=new MyRunnable();

		Thread th =new Thread(mr );
		th.start();
		System.out.println("Hello World!");
	}
}
