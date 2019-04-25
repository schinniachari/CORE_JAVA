package com.chinni.multi_threading.a.basic.thread.creation;

public class ThreadClassThreadCreation extends Thread {

	public static void main(String[] args) {
		ThreadClassThreadCreation th = new ThreadClassThreadCreation();
		th.start();
	}

	@Override
	public void run() {
		System.out.println("new thread created");
	}
}
