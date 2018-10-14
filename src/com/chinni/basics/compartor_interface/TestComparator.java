package com.chinni.basics.compartor_interface;

import java.util.Set;
import java.util.TreeSet;

public class TestComparator {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>(new ComparatorImpl());
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(10);
		System.out.println(set);
	}
}
