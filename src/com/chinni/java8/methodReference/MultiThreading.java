package com.chinni.java8.methodReference;

public class MultiThreading {
	public static void ThreadStatus() {
		System.out.println("Thread is running..."+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(MultiThreading::ThreadStatus);
		t2.start();
	}
}
