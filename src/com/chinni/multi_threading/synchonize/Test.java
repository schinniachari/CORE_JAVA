package com.chinni.multi_threading.synchonize;

public class Test {

	public static void main(String[] args) {
	/*	Display d = new Display();
		MyThread mt = new MyThread(d,"CHINNI");
		mt.start();
		MyThread mt1 = new MyThread(d,"******");
		mt1.start();*/
		DisplayStaticSync d = new DisplayStaticSync();
		MyThreadStaticSync mt = new MyThreadStaticSync(d,"CHINNI");
		mt.start();
		MyThreadStaticSync mt1 = new MyThreadStaticSync(d,"******");
		mt1.start();
	}

}
