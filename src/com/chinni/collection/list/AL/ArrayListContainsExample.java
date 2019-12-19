package com.sptech.collection.AL;

import java.util.*;

public class ArrayListContainsExample {
	public static void main(String args[]) {
		// initialize ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		// add elements to ArrayList object
		al.add(3);
		al.add(17);
		al.add(6);
		al.add(9);
		al.add(7);

		// check if ArrayList contains element
		if (al.contains(1)) {
			System.out.println("7 was found in the list");
		} else {
			System.out.println("7 was not found in the list");
		}
	}
}