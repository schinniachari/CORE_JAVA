package com.chinni.multi_threading.synchonize;

class SynchornizedCheck extends Thread {
	public synchronized void run() {
		System.out.println("run start of  " + getName());
		try {
			// BlockedStateCheck.m1(this);
			sleep(10000);
			System.out.println("in try block of  " + getName());
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		SynchornizedCheck sc = new SynchornizedCheck();
		sc.start();

		System.out.println("state of " + sc.getName() + " is " + sc.getState());
	}
}