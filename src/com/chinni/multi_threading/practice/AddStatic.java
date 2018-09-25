package com.chinni.multi_threading.practice;
class AddStatic{
	static int a,b;
	static synchronized void add(int x,int y){
		a=x;
		b=y;
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		int res=a+b;
		System.out.println("in "+Thread.currentThread().getName()+"Result: "+res);
	}
}
