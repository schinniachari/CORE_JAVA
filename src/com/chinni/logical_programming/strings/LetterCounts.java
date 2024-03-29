package com.chinni.logical_programming.strings;

import java.util.HashMap;
import java.util.Map;

public class LetterCounts {
	public static void main(String[] args) {
		System.out.println(calculateTheWords("ABCDABCDAD"));
	}

	private static String calculateTheWords(String seqWords) {
		char[] array = seqWords.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int index = 0; index < array.length; index++) {
			int count = 0;
			char eachChar = array[index];
			if (map.containsKey(eachChar))
				count = map.get(array[index]);
			map.put(eachChar, ++count);
		}
		return map.toString();
	}
}
