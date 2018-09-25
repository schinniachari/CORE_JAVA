package com.chinni.exception_handling.exception_handling;

public class InnerFinally {

	public static void main(String[] args) {
		 System.out.println(m1(9));
	}
  
	public static int m1(int i) {
		 
  	 	try {
		System.out.println("in outer try ");
		    try {
			System.out.println("in inner try ");
			
			} catch (NullPointerException e) {
				 System.out.println("in inner catch ");
			}
			 finally{
				 System.out.println("in inner finally");
				 
			 } 
		
		} catch (NullPointerException e) {
			 System.out.println("in outer catch ");
		}
		finally{
			 System.out.println("in outer finally");
			 return i;
		} 
		 //System.out.println("after t/c/f");
		
	}//m1()
  
}//class
