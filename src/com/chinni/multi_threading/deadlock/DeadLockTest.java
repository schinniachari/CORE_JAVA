package com.chinni.multi_threading.deadlock;

public class DeadLockTest extends Thread {
	A a = new A();
	B b = new B();

	@Override
	public void run() {System.out.println("in run()");
		a.d1(b);
	}

	public static void main(String[] args) {System.out.println("in main()");
		DeadLockTest dt = new DeadLockTest();
		dt.start();//new thread
		dt.m1();
	}

	private void m1() {System.out.println("in m1()");
		b.d1(a);//main thread
	}
}
