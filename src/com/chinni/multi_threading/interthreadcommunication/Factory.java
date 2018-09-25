package com.chinni.multi_threading.interthreadcommunication;

class Factory {
	int items;
	boolean itemsInFactory;

	synchronized void produce(int items) {
		if (itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		this.items = items;
		itemsInFactory = true;
		System.out.println("produced items" + items);
		notify();
	}

	synchronized void consume() {
		if (!itemsInFactory) {
			try {
				wait();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		itemsInFactory = false;
		System.out.println("  items consumed::" + items);
		notifyAll();
	}

}
