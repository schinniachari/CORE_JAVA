package com.chinni.logical_programming.sum_of_2_digits_in_range;

public class SumOfDigitsInRange {
    public static void main(String[] args) {
        System.out.println(rangeOfNumbers(1, 9));
    }

    private static int rangeOfNumbers(int start, int end) {
        int rangeCount = 0;
        for (int index = start; index < end; index++) {
            int num = index;
            if (num <= 9) {
                rangeCount += num;
                continue;
            }
            int temp = 0;
            while ((temp = num % 10) > 0) {
                rangeCount += temp;
                num /= 10;
            }
        }

        return rangeCount;
    }

}
