package com.chinni.multi_threading.practice;
class ThreadPrioritySet 	  extends Thread
{
	public void run(){
		System.out.println(getName()+" running bro");
	}
	public static void main(String[] args) 
	{
		ThreadPrioritySet sc1=new ThreadPrioritySet();
		ThreadPrioritySet sc2=new ThreadPrioritySet();
		
		sc1.setPriority(3);
		sc2.setPriority(4);
		
		sc1.setName("chinni thread-0");
		sc2.setName("chinni thread-1");

		sc1.start();
		sc2.start();
	}
}
