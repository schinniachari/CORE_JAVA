package com.chinni.multi_threading.practice;
class AddMyThread2 	extends Thread
{
	 Add a;
	 AddMyThread2(Add a){
		 this.a=a;
	 }
	 public void run(){
		 a.add(70,80);
	 }
}
