package com.chinni.multi_threading.practice;
class Add{
	static int x,y;
	static synchronized void add(int x,int y){
//		this.x=x;
//		this.y=y;
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
//		int res=this.x+this.y;
//		System.out.println("in "+Thread.currentThread().getName()+"Result: "+res);
	}
}
