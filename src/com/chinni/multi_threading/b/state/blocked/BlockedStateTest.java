package com.chinni.multi_threading.b.state.blocked;

class BlockedStateTest {
	public static void main(String[] args) throws InterruptedException {
		BlockedStateCheck1 bsc1 = new BlockedStateCheck1();
		BlockedStateCheck1 bsc2 = new BlockedStateCheck1();
		bsc2.start();
		bsc1.start();

		System.out.println("thread--> " + bsc1.getName() + " and its state " + bsc1.getState());
		System.out.println("thread--> " + bsc2.getName() + " and its state " + bsc2.getState());
	}
}