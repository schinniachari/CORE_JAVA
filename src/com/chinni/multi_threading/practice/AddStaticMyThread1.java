package com.chinni.multi_threading.practice;
class AddStaticMyThread1 	extends Thread
{
	 AddStatic a;
	 AddStaticMyThread1(AddStatic a){
		 this.a=a;
	 }
	 public void run(){
		 a.add(50,60);
	 }
}
