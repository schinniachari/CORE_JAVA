package com.chinni.basics.convertions;

import java.util.Arrays;

public class PrimitveToWrapperClasses {
	public static void main(String[] args) {
		int[] arrayOfPrimitive = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer[] arrayOfIntegerWrapper = new Integer[arrayOfPrimitive.length];
		// FOR JAVA 7
		for (int index = 0; index < arrayOfPrimitive.length; index++) {
			arrayOfIntegerWrapper[index] = Integer.valueOf(arrayOfPrimitive[index]);
		}
		System.out.println("java -7----->" + Arrays.asList(arrayOfIntegerWrapper));
		// IN JAVA-8 OR ABOVE
		Integer[] arrayOfWrapper = Arrays.stream(arrayOfPrimitive).boxed().toArray(Integer[]::new);
		Double[] arrayOfDoubleWrapper = Arrays.stream(new double[] { 0.0, 0.9 }).boxed().toArray(Double[]::new);
		System.out.println(Arrays.asList(arrayOfDoubleWrapper));
		;
		System.out.println(Arrays.asList(arrayOfWrapper));
	}
}
