package com.chinni.multi_threading.deadlock;

public class DeadlockExample {

    public static void main(String[] args) {
        final Object resource1 = new Object();
        final Object resource2 = new Object();

        // Thread 1
        new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource1");
                // Introduce some delay to increase the chance of deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource2");
                }
            }
        }).start();

        // Thread 2
        new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource2");
                // Introduce some delay to increase the chance of deadlock
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource1");
                }
            }
        }).start();
    }
}
