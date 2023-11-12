package com.chinni.multi_threading.interrupt;

public class InterruptExample {
    public static void main(String[] args) {
        // Create a thread
        Thread myThread = new Thread(() -> {
            try {
                // Simulate a task that takes time
                for (int i = 0; i < 5; i++) {
                    System.out.println("Working... " + i);
                    Thread.sleep(1000); // Simulating work
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while sleeping.");
            }
        });
        // Start the thread
        myThread.start();
        // Interrupt the thread after 3 seconds
        try {
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
