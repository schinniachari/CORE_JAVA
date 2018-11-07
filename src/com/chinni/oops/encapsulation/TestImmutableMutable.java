package com.chinni.oops.encapsulation;

public class TestImmutableMutable {
	public static void main(String[] args) {
		int val = 10;
		MutableClass mut = new MutableClass(val);
		System.out.println(mut.getValue());
		mut.setValue(20);
		System.out.println(mut.getValue());

		ImmutableClass imut =  ImmutableClass.getInstance(val, "chinni", new StringBuilder("achari"),
				new StringBuilder("chinniachari"));
		// GET THE VALUES OF IMMUTABLE OBJECTS
		String name = imut.getName();
		StringBuilder name1 = imut.getName1();
		StringBuilder comName = imut.getTestSB();
		int value = imut.getValue();
		// CHECK THE HASH-CODE
		System.out.println("String-" + name.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(comName.hashCode());
		System.out.println(value);
		// String--1361397883
		// 2018699554
		// 1311053135
		// 10

		// CHANGE THE VALUES
		name1.append("-added");
		name = name + "added";
		comName.append("-added");
		value = 30;

		// AFTER ADDING SOMETHING, CHECK THE VALUES
		System.out.println("String-" + name.hashCode());
		System.out.println(name1.hashCode());
		System.out.println(comName.hashCode());
		System.out.println(value);
		// String--1195764581
		// 2018699554
		// 1311053135
		// 30

		// PRINT ALL THE VALUES FROM IMMUTABLE-CLASS
		System.out.println(imut.getName());
		System.out.println(imut.getName1());
		System.out.println(imut.getTestSB());
		System.out.println(imut.getValue());
		// chinni
		// achari-added
		// chinniachari
		// 10
	}
}
