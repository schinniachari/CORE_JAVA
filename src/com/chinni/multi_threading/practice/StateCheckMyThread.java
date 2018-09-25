package com.chinni.multi_threading.practice;
class StateCheckMyThread extends Thread{	   //NEW , RUNNABLE , TIMED_WAITING , TERMINATED
public void run(){
System.out.println(" in new thread running ::"+this.getState());	
 	try{Thread.sleep(2000);}
	catch(Exception e){}
	System.out.println("run end");
    }
	public static void main(String[] args){
		System.out.println("min priority ::"+MIN_PRIORITY);
		System.out.println("min priority ::"+NORM_PRIORITY);
		System.out.println("min priority ::"+MAX_PRIORITY);
	try{	StateCheckMyThread sc=new StateCheckMyThread();
		System.out.println("i think it will in NEW state ::"+sc.getState());
		sc.start();
		System.out.println("i think it will in RUNNABLE state:::"+sc.getState());
		Thread.sleep(1000);
	    System.out.println(" please wait for some time::"+sc.getState());	
		Thread.sleep(3000);
		 System.out.println("terminate it::"+sc.getState());	
 	}
	catch(Exception e){}
	
	}
}
