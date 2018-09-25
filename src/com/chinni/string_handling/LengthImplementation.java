package com.chinni.string_handling;

import java.util.Scanner;

public class LengthImplementation {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string to find  its length");
	    String s=sc.nextLine();
	    System.out.print("inputed string is "+s+" and its length is "+length(s));
	}
   public static int length(String s){
		char[] charArray;
		charArray=s.toCharArray();
        return charArray.length ;
	}
}
