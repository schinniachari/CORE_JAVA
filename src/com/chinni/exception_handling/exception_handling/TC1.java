package com.chinni.exception_handling.exception_handling;

import java.util.*;

class TC1 {
	static int a;
	static int b;

	public static void main(String[] args) { 
		// inputs are taken BY USING Scanner method
		Scanner sc = new Scanner(System.in);

		// input taken by using Command line arguments
		/*
		 * int a =Integer.parseInt(args[0]); int b=Integer.parseInt(args[1]);
		 */
		while (true) {
			try {
				System.out.println("please enter 1st integers");
				a = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("please enter only integers");
			} catch (ArrayIndexOutOfBoundsException aioe) {
				System.out.println("please enter any two integers");
			} catch (ArithmeticException ae) {
				System.out.println("please enter 2nd number as integer not 0");
			}
		}
		while (true) {
			try {
				System.out.println("please enter 2nd integers");
				b = Integer.parseInt(sc.nextLine());
				int c = a / b;
				System.out.println("result of division is:::" + c);
				break;
			} catch (NumberFormatException e) {
				System.out.println("please enter only integers");
			} catch (ArrayIndexOutOfBoundsException aioe) {
				System.out.println("please enter any two integers");
			} catch (ArithmeticException ae) {
				System.out.println("please enter 2nd number as integer not 0");
			}
		}
	}
}
