package com.chinni.logical_programming.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostRepeatedSubstring {
//    public static String findMostRepeatedSubstring(String input, int minLength, int maxLength) {
//        if (input == null || input.isEmpty() || minLength > maxLength) {
//            return "Invalid input";
//        }
//
//        String mostRepeatedSubstring = "";
//        int maxCount = 0;
//
//        for (int len = minLength; len <= maxLength; len++) {
//            for (int i = 0; i <= input.length() - len; i++) {
//                String substring = input.substring(i, i + len);
//                int count = countSubstringOccurrences(input, substring);
//
//                if (count > maxCount) {
//                    maxCount = count;
//                    mostRepeatedSubstring = substring;
//                }
//            }
//        }
//
//        return mostRepeatedSubstring;
//    }
//
//    private static int countSubstringOccurrences(String input, String substring) {
//        int count = 0;
//        int index = 0;
//
//        while (index != -1) {
//            index = input.indexOf(substring, index);
//
//            if (index != -1) {
//                index++;
//                count++;
//            }
//        }
//
//        return count;
//    }

    public static void main(String[] args) {
        String input = "abcbcabcbabcbcab";
        int minLength = 2;
        int maxLength = 4;

        String mostRepeated = findMostRepeatedSubstring(input, minLength, maxLength);
        System.out.println("Most repeated substring: " + mostRepeated);
    }

    private static String findMostRepeatedSubstring(String value, int minLength, int maxLength) {
        if (value == null || value.isEmpty() || minLength > maxLength || maxLength < 0)
            return "Invalid Input";

        Map<String, Integer> mapOfSubStrings = new LinkedHashMap<>();

        String mostRepeatedString = "";
        int mostRepeatedStringLength = 0;
        for (int subStringLength = minLength; subStringLength <= maxLength; subStringLength++) {
            for (int index = 0; index < value.length(); index += subStringLength) {
                String subString = ((index + subStringLength) < value.length())
                        ? value.substring(index, (index + subStringLength))
                        : "";
                if (!subString.isEmpty()) {
                    int count = mapOfSubStrings.getOrDefault(subString, 0) + 1;
                    mapOfSubStrings.put(subString, count);
                    if (count > mostRepeatedStringLength) {
                        mostRepeatedString = subString;
                        mostRepeatedStringLength = count;
                    }
                }
            }
            System.out.println(mostRepeatedString + "  --  " + mostRepeatedStringLength);
        }
        System.out.println(mapOfSubStrings);
        return mostRepeatedString;
    }
}
