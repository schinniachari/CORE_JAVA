package com.chinni.basics;
public class CommandLineArguments { 	
	public static void main(String[] args) {

    int a=Integer.parseInt(args[0]);
    double d=Double.parseDouble(args[1]);
	char ch=args[2].charAt(5);
    				 System.out.println("a value is "+a+" and b value is "+d
						 + "  its char value is " +ch);

	} 
} 