package com.chinni.multi_threading.practice;
class AddStaticMyThread2 	extends Thread
{
	 AddStatic a;
	 AddStaticMyThread2(AddStatic a){
		 this.a=a;
	 }
	 public void run(){
		 a.add(70,80);
	 }
}
