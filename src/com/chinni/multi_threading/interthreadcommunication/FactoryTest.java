package com.chinni.multi_threading.interthreadcommunication;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;

class Factory {
    public String[] items = new String[]{"init"} ;
    public boolean isAvailableItems;

    synchronized void produce() {
        System.out.println("produce() - items =  " + Arrays.asList(items) + "   " +
                "isAvailable = " + isAvailableItems);
        if (isAvailableItems) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.items = StringUtils.split("Chinni Achari S SE", " ");
        isAvailableItems = true;
        notify();
    }

    synchronized void consume() {
        System.out.println("consume() - items =  " + Arrays.asList(items) + "   " +
                "isAvailable = " + isAvailableItems);
        if (!isAvailableItems) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.items = new String[]{};
        isAvailableItems = false;
        notifyAll();
    }
}

public class FactoryTest {
    public static void main(String[] args) {
        Factory f = new Factory();
        new Thread(() -> {
            for (int index = 0; index < 10; index++) {
                f.produce();
            }
        }).start();
        new Thread(() -> {
            for (int index = 0; index < 10; index++) {
                f.consume();
            }
        }).start();
    }
}
