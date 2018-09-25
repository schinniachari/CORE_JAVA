package com.chinni.java8.methodReference;

import java.util.function.BiPredicate;

public class Pre_def_Function {
	static class Arithmetic {
		public static int add(int a, int b) {
			return a + b;
		}
	}
	
	static class Arithmetic1 {
		public static int get(int a) {
			return a;
		}
	}

/*	public static void main(String[] args) {
		//PRE-DEF FUNCTION WHICH ACCEPTS 1 ARGUMENTS
		Function<Integer, Integer> adder = Arithmetic1::get;
	
		//apply(-,-) is abstract method
		int result = adder.apply(10);
		System.out.println(result);
	}*/
 
	/*	public static void main(String[] args) {
		//PRE-DEF FUNCTION WHICH ACCEPTS 2 ARGUMENTS
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		//apply(-,-) is abstract method
		int result = adder.apply(10, 20);
		System.out.println(result);
	}*/
	

/*	public static void main(String[] args) {
		//PRE-DEF predicate FUNCTION WHICH ACCEPTS 1 ARGUMENTS
		Predicate<Integer> predicate = age -> (age>18);
	    
		System.out.println(predicate.test(18));
		 
	}*/
	public static void main(String[] args) {
	 BiPredicate<Integer, String> condition = (i,s)-> i>20 && s.toUpperCase().startsWith("R");
	 System.out.println(condition.test(100, "rajiv"));
	}
}
