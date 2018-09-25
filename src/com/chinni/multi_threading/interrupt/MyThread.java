package com.chinni.multi_threading.interrupt;

public class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println("im MyThread" + i);
		}
		System.out.println("i want to sleep for some time");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("INTERRUPTED EXCEPTION IS RAISED");
		}
	}
}
