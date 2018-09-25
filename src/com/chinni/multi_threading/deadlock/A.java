package com.chinni.multi_threading.deadlock;

public class A {
	public synchronized void d1(B b) {
		System.out.println("in A.d1()");
		b.last();
	}

	public synchronized void last() {
		System.out.println("in A.last()");
	}
}
