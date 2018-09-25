package com.chinni.multi_threading.interthreadcommunication;

class FactoryTest {
	public static void main(String[] args) {
		Factory f = new Factory();
		Producer p = new Producer(f);
		Consumer c = new Consumer(f);
	}
}
