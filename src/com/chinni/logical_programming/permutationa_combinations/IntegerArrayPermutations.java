package com.chinni.logical_programming.permutationa_combinations;

import java.util.HashSet;
import java.util.Set;

public class IntegerArrayPermutations {
	public static void main(String[] args) {
		int[] array={1,2,3,1,4};
		System.out.println(getAllPermutations(array) );
	}

	private static int getAllPermutations(int[] array) {
		Set<Integer> uniqueArray=new HashSet<>();
		for (int index = 0; index < array.length; index++) {
			uniqueArray.add(array[index]);
		}
		if(uniqueArray.size()==array.length)
			return fact(array.length);
		return fact(array.length)/fact((array.length-uniqueArray.size())+1);
	}
	private static int fact(int totalIntLength) {
		int result=1;
		while(totalIntLength>0){
			result=result*totalIntLength--;
		}
		return result;
	}
}
