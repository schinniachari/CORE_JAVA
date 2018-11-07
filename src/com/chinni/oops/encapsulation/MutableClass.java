package com.chinni.oops.encapsulation;

public class MutableClass {

	private int value;

	public MutableClass(int aValue) {
		value = aValue;
	}

	public void setValue(int aValue) {
		value = aValue;
	}

	public int getValue() {
		return value;
	}
}
