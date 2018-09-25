package com.chinni.exception_handling.exception_handling;

public class InnerFinally3 {

	public static void main(String[] args) {
		 System.out.println(m1(9));
	}
  
	public static int m1(int i) { 
  	 	try {
		System.out.println("in outer try ");
		    try {
			System.out.println("in inner try ");
			System.out.println(10/0);
			} catch (NullPointerException e) {
				 System.out.println("in inner catch ");
			}
			 finally{
				 System.out.println("in inner finally");
				 
			 } 
		
		} catch (ArithmeticException e) {
			 System.out.println("in outer catch ");
		}
		finally{
			 System.out.println("in outer finally");
			  
		} 
		 System.out.println("after t/c/f");
		return i;
	
	}//m1()
  
}//class
