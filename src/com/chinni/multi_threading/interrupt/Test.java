package com.chinni.multi_threading.interrupt;

public class Test {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		System.out.println("i'm interrupting now");
		mt.interrupt();
		System.out.println("end of main method");
	}

}
