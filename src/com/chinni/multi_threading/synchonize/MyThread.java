package com.chinni.multi_threading.synchonize;

public class MyThread extends Thread {
	public Display d;
	public String name;

	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish2();
		d.wish(name);
		d.wish1();
	}
}
