package com.chinni.java8;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator {

	/**
	 * Close the constructor because ArrayIterator is part of the utility class.
	 */
	protected ArrayIterator() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns an iterator that goes over the elements in the array.
	 *
	 * @param <E>
	 *            type of an array element
	 * @param array
	 *            source array to iterate over it
	 * @return an iterator that goes over the elements in the array
	 */
	public static <E> Iterator<E> iterator(final E[] array) {
		return new Iterator<E>() {
			/**
			 * Index of the current position
			 *
			 */
			private int index = 0;

			/**
			 * Returns the next element in the iteration
			 *
			 * @return the next element in the iteration
			 * @throws NoSuchElementException
			 *             if the iteration has no more elements
			 */
			@Override
			public boolean hasNext() {
				return (index < array.length);
			}

			/**
			 * Returns {@code true} if the iteration has more elements. (In other words,
			 * returns {@code true} if {@link #next} returns an element, rather than
			 * throwing an exception.)
			 *
			 * @return {@code true} if the iteration has more elements
			 */
			@Override
			public E next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				return array[index++];
			}

			/**
			 * This method does not need to be overwritten in JDK 8.
			 */
			// @Override
			// public void remove() {
			// throw UnsupportedOperationException(
			// "Arrays don't support remove.")
			// }
		};
	}

	/**
	 * Sample usage of the ArrayIterator
	 *
	 * @param args
	 *            command-line arguments
	 */
	public static void main(final String[] args) {
		Iterator<String> it = ArrayIterator.iterator(new String[] { "one", "two", "three" });

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
