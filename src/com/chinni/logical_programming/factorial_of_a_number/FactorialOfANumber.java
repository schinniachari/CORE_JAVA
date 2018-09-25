package com.chinni.logical_programming.factorial_of_a_number;

public class FactorialOfANumber {

	public static void main(String[] args) {
		System.out.println(fact(0));
	}
	public static int fact(int n){
		return (n<2)?1:(n*fact(n-1));
	}
}
