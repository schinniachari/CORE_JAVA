package com.chinni.multi_threading.practice;
class PrintMsg{
	synchronized void printMsg(String msg)	{
	System.out.println("["+msg);
	try
	{
		Thread.sleep(100);
	}
	catch (Exception e)
	{
 	}
		System.out.println("]");
	}
 }
