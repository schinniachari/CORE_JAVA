package com.chinni.multi_threading.practice;

class MulMTSame1to20 extends Thread {
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println(getName() + " run  " + i);
		}
	}

	public static void main(String[] args) {
		MulMTSame1to20 mt = new MulMTSame1to20();
		mt.start();
		MulMTSame1to20 mt1 = new MulMTSame1to20();
		mt1.start();
		System.out.println("Hello World!");
		for (int i = 0; i <= 20; i++) {
			System.out.println("in main thread" + i);
		}
	}
}