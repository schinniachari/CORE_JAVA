package com.sptech.collection.AL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(18);
		numbers.add(25);
		numbers.add(40);

		Iterator<Integer> numbersIterator = numbers.iterator();
		while (numbersIterator.hasNext()) {
			// numbers.add(18);
			// numbers.remove(1);
			Integer num = numbersIterator.next();
			System.out.println(num);
			if (num % 2 != 0) {
				numbersIterator.remove();
			}
		}

		System.out.println(numbers);
	}
}
