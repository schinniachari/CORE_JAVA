package com.chinni.logical_programming.permutationa_combinations;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Finding all permutations of given String in a Java Program ..is a tricky question and asked many times in interviews.
public class StringPermutations {

	public static int count;
	public static Set<String> set = new LinkedHashSet<String>();
	public static Set<String> uniqueSet = new LinkedHashSet<String>();

	public static void main(String[] args) {
		System.out.println(getAllPermutations("ABCD")); 
	}

	private static int getAllPermutations(String value) {
		value = convertIntoProperOrder(value);
		int length = value.length();
		int iterations = (length == 3) ? length - 2 : length - 1;
		set.add(value);
		for (int index = 0; index < iterations; index++) {
			String swapped = swap(value, index, length);
			set.add(swapped);
		}
		List<String> list = new ArrayList(set);
		for (int i = 0; i < list.size(); i++) {
			printAllThePermutations(list.get(i));
			System.out.println();
		}
		return count;
	}

	private static String convertIntoProperOrder(String value) {
		char[] charArray = value.toCharArray();
		char[] newCharArray = new char[charArray.length];
		int newArrayIndex = 0;
		outer: for (int index = 0; index < charArray.length; index++) {
			char eachChar = charArray[index];
			if (eachChar != ' ')
				newCharArray[newArrayIndex++] = eachChar;
			for (int i = index + 1; i < charArray.length && eachChar != ' '; i++) {
				if (eachChar == charArray[i]) {
					newCharArray[newArrayIndex++] = charArray[i];
					charArray[i] = ' ';
					continue outer;
				}
			}
		}
		return new String(newCharArray);
	}

	private static void printAllThePermutations(String eachPossibility) {
		if (!checkForSameCharacters(eachPossibility)) {
			StringBuilder sb = new StringBuilder(eachPossibility);
			String shift;
			for (int i = 0; i < eachPossibility.length(); i++) {
				count++;
				shift = sb.substring(1, eachPossibility.length()) + sb.charAt(0);
				if(uniqueSet.add(shift))
					System.out.println((count) + "-" + shift);
				sb = new StringBuilder(shift);
			}
		} else {
			count++;
			System.out.println((count) + "-" + eachPossibility);
		}
	}

	private static boolean checkForSameCharacters(String eachPossibility) {
		char[] charArray = eachPossibility.toCharArray();
		char testChar = charArray[0];
		for (int i = 0; i < charArray.length; i++) {
			if (testChar == charArray[i])
				continue;
			else
				return false;
		}
		return true;
	}

	private static String swap(String value, int index, int length) {
		char[] strArray = value.toCharArray();
		char currentChar = strArray[index];
		strArray[index] = strArray[(index + 1) % length];
		strArray[(index + 1) % length] = currentChar;
		return new String(strArray);
	}

}
