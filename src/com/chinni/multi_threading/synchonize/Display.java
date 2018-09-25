package com.chinni.multi_threading.synchonize;

public class Display {
	// FIRST SYNC MEHTOD
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("GOOD MORNING " + name + " " + i + " " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// SECOND SYNCHRONIZED METHOD
	public synchronized void wish1() {
		System.out.println("wish1" + " " + Thread.currentThread().getName());
	}

	// NON-SYNC METHOD
	public void wish2() {
		System.out.println("wish2" + " " + Thread.currentThread().getName());
	}
}
