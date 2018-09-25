package com.chinni.multi_threading.interthreadcommunication;

class Producer implements Runnable {
	Factory f;

	Producer(Factory f) {
		this.f = f;
		new Thread(this, "producer").start();
	}

	public void run() {

		f.produce(2);
	}
}