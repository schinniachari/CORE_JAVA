package com.chinni.multi_threading.practice;
class MyThread1 extends Thread 
{
	public void run(){
		System.out.println("MT 1 priority:"+this.getPriority());
		System.out.println("MT 1daemon:"+this.isDaemon());
	}
}

class MyThread2 extends Thread 
{
	public void run(){
		System.out.println("MT 2 priority:"+this.getPriority());
		System.out.println("MT 2 daemon:"+this.isDaemon());
		MyThread1 mt1 =new MyThread1();
		mt1.start();
	}
}


 class ParentProsToChild{
	 public static void main(String[] args) throws InterruptedException	{
		System.out.println("Hmain start ");
		Thread th =Thread .currentThread();
		System.out.println("MT  priority:"+ th.getPriority());
		System.out.println("MT  daemon:"+th.isDaemon());
  		MyThread2 mt2 =new MyThread2();
		mt2.start();
		System.out.println("MT2  priority:"+mt2.getPriority());
		System.out.println("MT2 daemon:"+mt2.isDaemon());
		mt2.setPriority(7);
		 //mt2.setDaemon(true);
		//mt2.start();
		Thread.sleep(3000);
		System.out.println("main exited");
	 
	}
}
