package com.sptech.collection.comparable_comparator;

import java.util.Arrays;
import java.util.Comparator;

class Dog {
	int size;

	public Dog(int s) {
		size = s;
	}

	@Override
	public String toString() {
		return "Dog [size=" + size + "]";
	}

}

class DogSizeComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		System.out.println(o1 + " - " + o2);
		return o1.size - o2.size;
	}
}

public class ArraySort {

	public static void main(String[] args) {
		Dog d1 = new Dog(40);
		Dog d2 = new Dog(10);
		Dog d3 = new Dog(20);
		Dog d4 = new Dog(30);

		Dog[] dogArray = { d1, d2, d3,d4 };
		printDogs(dogArray);

		Arrays.sort(dogArray, new DogSizeComparator());
		printDogs(dogArray);
	}

	public static void printDogs(Dog[] dogs) {
		for (Dog d : dogs)
			System.out.print(d.size + " ");
		System.out.println();
	}
}