package com.chinni.logical_programming.convertions;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        System.out.println(convertToInt("1234501111"));
        ConcurrentHashMap cm = null;
    }


    private static int convertToInt(String value) {
        char[] charValues = value.toCharArray();
        int result = 0;
        for (int index = 0; index < charValues.length; index++) {
            int intValue = charValues[index];
            if (intValue >= 48 && intValue <= 57) {
                result += calculateTheValuePostion(Character.getNumericValue(intValue), charValues.length - index);
                continue;
            }
            throw new RuntimeException("NUMBER-FORMAT-EXCEPTION");
        }
        return result;
    }

    private static int calculateTheValuePostion(int value, int position) {
        switch ((position)) {
            case 1:
                value = value * 1;
                break;

            case 2:
                value = value * 10;
                break;

            case 3:
                value = value * 100;
                break;

            case 4:
                value = value * 1000;
                break;

            case 5:
                value = value * 10000;
                break;

            case 6:
                value = value * 100000;
                break;

            case 7:
                value = value * 1000000;
                break;

            default:
                break;
        }
        return value;
    }

}