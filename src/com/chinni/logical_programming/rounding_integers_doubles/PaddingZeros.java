package com.chinni.logical_programming.rounding_integers_doubles;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class PaddingZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		NumberFormat format = new DecimalFormat("0000");
		System.out.println(format.format(val));

	}

}
