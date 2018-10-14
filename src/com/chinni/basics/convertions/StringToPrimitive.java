package com.chinni.basics.convertions;

public class StringToPrimitive {
	public static void main(String[] args) {
		String value = "1234";
		// valueOf returns a new or cached instance of java.lang.Integer
		// valueOf() METHOD INTERNALLY USES parseInt()--> Recursive Method call
		Integer intValue = Integer.valueOf(value);
		int intValue1 = Integer.valueOf(value);
		System.out.println(intValue);
		System.out.println(intValue1);

		// parseInt returns primitive int.
		int intVal = Integer.parseInt(value);
		System.out.println(intVal);
	}
}
