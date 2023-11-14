package com.chinni.collection.map.WHM;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> weakHashMap = new WeakHashMap<>();

        String key = new String("exampleKey");
        weakHashMap.put(key, 42);

        System.out.println("WeakHashMap: " + weakHashMap);

        // Removing the strong reference to the key
        key = null;

        // Triggering garbage collection to remove the entry
        System.gc();

        System.out.println("WeakHashMap after GC: " + weakHashMap);
    }
}
