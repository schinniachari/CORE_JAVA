package com.chinni.logical_programming.fizz_buzz;

import java.util.Scanner;

/*Write a Java program that prints the numbers from 1 to 50. 
 * But for multiples of three print "Fizz" instead of the number and 
 * for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz"
 */
public class FizzBuzzTest {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int maxNumber = Integer.valueOf(sc.nextLine());
//		startProcess(maxNumber);
	}

	private static void startProcess(int maxNumber) {
		while (maxNumber-- > 1) {
			int multipleOfThree = maxNumber % 3;
			int multipleOfFive = maxNumber % 5;
			String printValue = "";
			if (multipleOfFive == 0&& multipleOfThree == 0) {
				System.out.println("FIZZBUZZ"+maxNumber);
			} else if (multipleOfThree == 0) {
				System.out.println("FIZZ"+maxNumber);
			} else if (multipleOfFive == 0 ) {
				System.out.println("BUZZ"+maxNumber);
			} else {
				System.out.println(maxNumber);
			}
		}
	}
}
