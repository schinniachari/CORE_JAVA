package com.chinni.logical_programming.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class LargestSubString {
    public static void main(String[] args) {
//        System.out.println(findLargestSubStringOrderedString());
        System.out.println(findLargestSubStringUnorderedString());
    }

    private static String findLargestSubStringUnorderedString() {
        String str = "AAABBBCCDDDEFGHIJJJJJAAA";
        char[] chArray = str.toCharArray();

        Map<Character, Integer> charCountMap = new HashMap<>();
        char mostRepeatedChar = chArray[0];
        int mostRepeatedCharCount = 1;

        for (int index = 0; index < chArray.length; index++) {
            int count = charCountMap.getOrDefault(chArray[index], 0) + 1;
            charCountMap.put(chArray[index], count);
            if (count >= mostRepeatedCharCount) {
                mostRepeatedCharCount = count;
                mostRepeatedChar = chArray[index];
            }
        }

        return mostRepeatedChar + " - " + charCountMap.get(mostRepeatedChar);
    }

    private static String findLargestSubStringOrderedString() {
        char[] chArray = "AAABBBCCDDDEFGHIJJJ".toCharArray();
        char resChar = ' ';
        int resCount = 0, tempCount = 1;
        //if same char?
        for (int index = 0; index < chArray.length; index++) {
            if (index < chArray.length - 1 && chArray[index] == chArray[index + 1]) {
                tempCount++;
            } else {
                if (tempCount >= resCount) {
                    resCount = tempCount;
                    resChar = chArray[index];
                }
                tempCount = 1;
            }
        }
        return resChar + " - " + resCount;
    }
}
