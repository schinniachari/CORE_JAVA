package com.chinni.multi_threading.b.state.blocked;

class BlockedStateCheck1 extends Thread {
	public  void run() {
		try {
			if (currentThread().getName().equals("Thread-1")) {
				System.out.println("only for thread-1");
//				m1();
//				sleep(5000);
			}
			System.out.println("run() of   " + getName()+" and its state is "+getState());
		} catch (Exception e) {
		}
	}

	static  void m1() {
		System.out.println("in m1 method");
	}
}