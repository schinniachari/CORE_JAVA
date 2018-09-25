package com.chinni.multi_threading.interthreadcommunication;

class Consumer implements Runnable {
	Factory f;

	Consumer(Factory f) {
		this.f = f;
		new Thread(this, "consumer").start();
	}

	public void run() {
		f.consume();
	}
}
