package com.chinni.basics.compartor_interface;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println(o1+"---"+o2);
		int diff=o1-o2;
		return diff==0?1:diff;
	}
}
