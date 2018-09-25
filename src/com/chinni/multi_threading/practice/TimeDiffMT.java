package com.chinni.multi_threading.practice;
class TimeDiffMT extends Thread{
	static PrintNum pno=new PrintNum();
	
	public void run(){
		pno.print20to1();
	}
 	public static void main(String[] args) {
		  TimeDiffMT th=new TimeDiffMT();
		   long time1=System.currentTimeMillis();
		   th.start();
           pno.print1to20();
		   long time2=System.currentTimeMillis();
		   System.out.println();
 		   System.out.println("time taken:"+(time2-time1)/1000+"secs");
 	}
}
