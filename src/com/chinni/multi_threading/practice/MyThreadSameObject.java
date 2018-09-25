package com.chinni.multi_threading.practice;

class MyThreadSameObject extends Thread {
	PrintNumbers pn;

	MyThreadSameObject(PrintNumbers p) {
		pn = p;
	}

	public void run() {
		pn.display();
	}
}