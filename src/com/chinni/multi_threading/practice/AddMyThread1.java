package com.chinni.multi_threading.practice;
class AddMyThread1 	extends Thread
{
	 Add a;
	 AddMyThread1(Add a){
		 this.a=a;
	 }
	 public void run(){
		 a.add(50,60);
	 }
}
