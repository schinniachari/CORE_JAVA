package com.chinni.java8.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaExpressionCheck {
	interface IntegerMath {
		int operation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}

	public static void main(String... args) {

		List<String> al = new ArrayList<String>();
		al.add("chinni");
		al.add("achari");
		al.add("sai");
		al.add("eswar");
		for (String s : al) {
			System.out.println(al);
			al.add("s");
		}
		for (Iterator<String> iterator = al.iterator(); iterator.hasNext();) {
			String s = iterator.next();
			System.out.println(al);
			al.add("s");
		}

		LambdaExpressionCheck myApp = new LambdaExpressionCheck();

		// lambda expressions that take more than one formal parameter
		// IntegerMath addition = (a, b) -> {return (a + b);};
		IntegerMath addition = (a, b) -> (a * b);
		IntegerMath subtraction = (a, b) -> a - b;
		System.out.println(addition.hashCode());
		System.out.println(addition.operation(10, 202));
		System.out.println(subtraction.operation(300, 400));
		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 - 10 = " + myApp.operateBinary(20, 10, subtraction));
	}
}
