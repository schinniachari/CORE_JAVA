package com.chinni.java8.methodReference;

import java.util.function.Consumer;

public class MetthodReference1 {

	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
	public static void saySomething1(String str) {
		System.out.println("Hello, "+str+" this is static method1111");
	}

	public static void main(String[] args) {
		System.out.println("started");
		// some functional interface Referring static method from 
/*		SomeInterface sayable = MetthodReference1::saySomething;
		System.out.println(sayable);
		// Calling interface method
		sayable.hi();
		sayable.say();*/
		
		//referring same functional interface with argumented method
		SomeInterface sayable1=MetthodReference1::saySomething1;
		sayable1.hi("chinniacahri");
		
		//refering to pre-def functional interface
		Consumer<String> c = System.out::println;
		c.accept("Hello");
	}
}
