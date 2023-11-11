package com.chinni.logical_programming.strings;

public class BigSum {
    public static void main(String[] args) {
        System.out.println(sum("8944394323791464", "14472334024676221", "23416728348467685"));
    }

    public static String sum(String s, String s1, String s2) {
        if (s == null || s1 == null)
            return null;
        char[] c = s.toCharArray(), c1 = s1.toCharArray();
        int indexC = c.length-1, indexC1 = c1.length-1;
        StringBuilder sum = new StringBuilder();
        int sumValue, buffer = 0;
        int index;
        for (index = Math.max(indexC, indexC1); index >= 0; index--) {
            sumValue = ((indexC >= 0) ? c[indexC--] - '0' : 0) +
                    ((indexC1 >= 0) ? c1[indexC1--] - '0' : 0);
            sum.insert(0, ((sumValue % 10) + buffer));
            buffer = sumValue / 10;
        }
        return "" + sum;
    }

}
