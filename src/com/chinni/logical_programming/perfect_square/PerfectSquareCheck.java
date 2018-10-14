package com.chinni.logical_programming.perfect_square;

public class PerfectSquareCheck {
	public static void main(String[] args) {
		System.out.println(checkPerfectSquare(205));
	}

	private static boolean checkPerfectSquare(int i) {
		double value=Math.sqrt(i);
		double difference=value-Math.floor(value);
		return difference==0;
	}
}