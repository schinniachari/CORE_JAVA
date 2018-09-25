package com.chinni.multi_threading.practice;
class PrintNum{ 
    void print1to20(){
		for (int i=0;i<=200 ;i++ ) {
			System.out.print(i+" \t");
			try{
				Thread.sleep(10);
			}
			catch(Throwable t){}
		}
	}
		
	void print20to1(){
		for (int i=200;i>=0 ;i-- ) {
			System.out.print ( i+"\t ");
				try{
				Thread.sleep(10);
			}
			catch(Throwable t){}
		}
	}
}
