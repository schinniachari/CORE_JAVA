package com.chinni.exception_handling.exception_handling;

public class FinallyWithBreakContinue {

	public static void main(String[] args) {
		 System.out.println(m1(9));
	}
  
	public static int m1(int i) {
		while(i==9){
  	 	try {
		System.out.println("in try ");
		
		} catch (NullPointerException e) {
			 System.out.println("in catch ");
		}
		 finally{
			 System.out.println("in finally");
			 continue;
		 } 
		}//while
		return i;
	}//m1()
  
}//class
