package com.chinni.logical_programming.fibonacci_series;

import java.util.Arrays;

public class FibonaciiSeries {
	public static void main(String[] args) {
		System.out.println( Arrays.asList(getFibonaciiSeries(10)));
	}

	private static Integer[] getFibonaciiSeries(int limitOfSeries) {
		int[] arrayOfNumbers=new int[limitOfSeries];
		arrayOfNumbers[0]=0;
		arrayOfNumbers[1]=1;
		for (int index = 2; index < limitOfSeries; index++) {
			arrayOfNumbers[index]=arrayOfNumbers[index-1]+arrayOfNumbers[index-2];
		}
		Integer[] arrayOfIntegerWrappers = Arrays.stream( arrayOfNumbers ).boxed().toArray( Integer[]::new );
		return arrayOfIntegerWrappers;
	}
}
