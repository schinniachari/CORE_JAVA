package com.chinni.multi_threading.deadlock;

public class B {

	public synchronized void d1(A a) {
		System.out.println("in B.d1()");
		a.last();
	}

	public synchronized void last() {
		System.out.println("in B.last()");
	}

}
