package com.chinni.multi_threading.practice;

class BlockedStateCheck1 extends Thread {
	public synchronized void run() {
		try {
			if (currentThread().getName().equals("Thread-1")) {
				System.out.println("only for thread-1");
				m1();
				sleep(10);
			}
			System.out.println("run start of  " + getName());
		} catch (InterruptedException e) {
		}
	}

	static synchronized void m1() {
		System.out.println("in m1 method");
	}
}