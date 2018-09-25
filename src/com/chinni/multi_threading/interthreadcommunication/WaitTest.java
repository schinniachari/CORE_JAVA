package com.chinni.multi_threading.interthreadcommunication;

class WaitTest {
	synchronized void m1() {
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("Exception baiyya::"+e);
		}
	}

	public static void main(String[] args) {
		WaitTest wt = new WaitTest();
		wt.m1();
		System.out.println("Hello World!");
	}
}
