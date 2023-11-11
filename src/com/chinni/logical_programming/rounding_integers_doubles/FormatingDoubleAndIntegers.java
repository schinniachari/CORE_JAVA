package com.chinni.logical_programming.rounding_integers_doubles;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatingDoubleAndIntegers {
    public static void main(String[] args) {
        System.out.println(format(14.0184849945)); // prints '14.01'
        System.out.println(format(13)); // prints '13'
        System.out.println(format(3.5)); // prints '3.5'
        System.out.println(format(3.138136)); // prints '3.13'
    }

    public static String format(Number n) {
        NumberFormat format = DecimalFormat.getInstance();
        format.setRoundingMode(RoundingMode.FLOOR);
        format.setMinimumFractionDigits(0);
        format.setMaximumFractionDigits(2);
        return format.format(n);
    }
}