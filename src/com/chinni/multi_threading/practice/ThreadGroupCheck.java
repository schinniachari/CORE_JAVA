package com.chinni.multi_threading.practice;

class ThreadGroupCheck extends Thread {

	public static void main(String[] args) {
		Thread th = currentThread();
		ThreadGroup th1 = th.getThreadGroup();
		String s = th1.getName();
		System.out.println("Name Of The Thread Is" + "   " + th + "---" + th1 + "  " + s);
	}
}
