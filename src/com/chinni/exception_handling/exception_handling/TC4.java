package com.chinni.exception_handling.exception_handling;

class TC4 {
	public static void main(String[] args) {
		try {
			System.out.println("in  try");
			System.out.println(3 / 0);
		}
		/*catch (String e) {
			System.out.println("in  catch ");
		}*/
		/*
		 * catch (ArithmeticException e) { System.out.println("in catch ae"); }
		 */

		finally {
			System.out.println("in finally ae");
		}
		System.out.println(" after outer try/catch");
	}
}
