package com.chinni.multi_threading.synchonize;

public class MyThreadStaticSync extends Thread {
	public DisplayStaticSync d;
	public String name;

	public MyThreadStaticSync(DisplayStaticSync d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish2();
		d.wish3();
		d.wish4();
		d.wish(name);
		d.wish1();
	}
}
