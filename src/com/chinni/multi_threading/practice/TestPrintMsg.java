package com.chinni.multi_threading.practice;
class TestPrintMsg 
{
	public static void main(String[] args) 
	{
		PrintMsg pm=new PrintMsg();
		MyThreadPrintMsg obj1=new MyThreadPrintMsg(pm,"hi");
		MyThreadPrintMsg obj2=new MyThreadPrintMsg(pm,"hello");
		MyThreadPrintMsg obj3=new MyThreadPrintMsg(pm,"HRU");
 	}
}
