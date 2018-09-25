package com.chinni.multi_threading.practice;
class MT1to20 	extends Thread{
	public void run(){
		for (int i=0;i<=20 ;i++ )	{
			System.out.println("in thread0"+i);
		}
		}
	public static void main(String[] args) 
	{	 
		MT1to20 mt=new MT1to20();
		mt.start();
		System.out.println("Hello World!");
				for (int i=0;i<=20 ;i++ )	{
			System.out.println("in main thread"+i);
		}
	}
}