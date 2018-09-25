package com.chinni.java8.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	
	
 
	public static class Marks {
		public int getMarks(int... a) {
			int c = 0;
			for (int b : a)
				c = c + b;
			return c;
		}
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40);
		
		list.forEach(i -> System.out.println(i));
		System.out.println("---------------------------");
		list.forEach(System.out::println);
		
	}

 
}
