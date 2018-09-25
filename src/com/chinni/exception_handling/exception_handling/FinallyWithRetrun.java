package com.chinni.exception_handling.exception_handling; 
public class FinallyWithRetrun { 
	public static void main(String[] args) {
		  System.out.println(m1());
		  //m1();
	} 
	//private static void m1() {
		private static int m1() {
		 try {
			System.out.println("in try");
			System.out.println(10/0);
//			return 10/0;
		 } 
		 catch (NullPointerException e) {
			 System.out.println("in catch");
			  
		 }
		 finally{
			 System.out.println("in finally ");
			  int[] a = new int[-3];
			 //return 10;
		 }
		 return 30;
	} 
} 