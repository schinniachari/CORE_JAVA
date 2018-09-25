package com.chinni.multi_threading.practice;

class BlockedStateCheck {
	public static void main(String[] args) throws InterruptedException {
		BlockedStateCheck1 bsc1 = new BlockedStateCheck1();
		BlockedStateCheck1 bsc2 = new BlockedStateCheck1();
		bsc1.start();
		bsc2.start();

		System.out.println("state of1 " + bsc1.getName() + " is " + bsc1.getState());
		System.out.println("state of 1" + bsc2.getName() + " is " + bsc2.getState());
	}
}