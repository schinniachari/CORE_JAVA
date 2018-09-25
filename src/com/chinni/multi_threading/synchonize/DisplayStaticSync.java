package com.chinni.multi_threading.synchonize;

public class DisplayStaticSync {
	// FIRST SYNC MEHTOD
	public static synchronized void wish(String name) {
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
	public static synchronized void wish1() {
		System.out.println("wish1" + " " + Thread.currentThread().getName());
	}

	// NORMAL SYNC METHOD
	public void wish2() {
		System.out.println("wish2" + " " + Thread.currentThread().getName());
	}

	// STATIC METHOD
	public static void wish3() {
		System.out.println("wish3" + " " + Thread.currentThread().getName());
	}

	// INSTANCE METHOD
	public void wish4() {
		System.out.println("wish4" + " " + Thread.currentThread().getName());
	}
}
