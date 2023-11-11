package com.chinni.multi_threading.a.basic.thread.creation;

public class RunnableInterfaceThreadCreation implements Runnable {
    @Override
    public void run() {
        System.out.println("my runnable thread");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableInterfaceThreadCreation());
        t.start();
    }
}
