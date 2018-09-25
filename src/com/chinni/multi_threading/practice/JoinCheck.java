package com.chinni.multi_threading.practice;

class JoinCheck extends Thread {
	public void run() {
		System.out.println(" run start");
		try {
			Thread.sleep(5000);
			System.out.println("in try block");
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinCheck jc = new JoinCheck();
		jc.start();
		jc.join();
		System.out.println("Hello World!");
	}
}
