package com.chinni.multi_threading.practice;

class MyRunnable7 extends Thread implements Runnable {

	public void run(String s) {
		System.out.println("in run string param");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
