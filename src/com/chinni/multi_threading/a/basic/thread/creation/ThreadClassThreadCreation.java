package com.chinni.multi_threading.a.basic.thread.creation;

public class ThreadClassThreadCreation extends Thread {

    public static void main(String[] args) {
        //from java-8
        new Thread(() -> {
            System.out.println("java-8 way of creating " + currentThread().getName() + " - " + currentThread().getState());
        }).start();

        //legacy
        ThreadClassThreadCreation th = new ThreadClassThreadCreation();
        th.start();
    }

    @Override
    public void run() {
        System.out.println("new thread created");
    }
}
