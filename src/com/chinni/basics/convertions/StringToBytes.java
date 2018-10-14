package com.chinni.basics.convertions;

import java.util.Arrays;

public class StringToBytes {
public static void main(String[] args) {
	String val="chinni";
	byte[] byteArray=val.getBytes();
	System.out.println(Arrays.toString(byteArray));
}
}
