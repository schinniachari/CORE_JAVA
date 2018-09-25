package com.chinni.multi_threading.practice;
class  PrintNumbers{
	synchronized void display(){
		for (int i=0; i<=20;i++ ){
        	System.out.println(Thread.currentThread().getName()+"run:"+i);
//        	System.out.println(mt1.getState()+"run:"+i);
		}
	}
}