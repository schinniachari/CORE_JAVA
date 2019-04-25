package com.chinni.multi_threading.practice;

class MyThreadPrintMsg implements Runnable {
	String s;
	PrintMsg p;
	Thread th;

	MyThreadPrintMsg(PrintMsg p, String s) {
		this.s = s;
		this.p = p;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		p.printMsg(s);
	}
}