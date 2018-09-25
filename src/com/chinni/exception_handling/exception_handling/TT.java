package com.chinni.exception_handling.exception_handling;

class TT{
	public static void main(String[] args) {
		 TestTT e=new  TestTT();
		 TT3 e1=new TT3();
		 try
		 {
		 	e1.m1();
		 }
		 catch (RuntimeException re)
		 {
		 System.out.println(re);
		 }
		 	catch ( InterruptedException ie) {
 		System.out.println("in ie catch");
 }
 try{				 
	 e.m1();
	}
	catch ( InterruptedException ie) {
 		System.out.println("in ie catch");
 }
 catch (ArithmeticException ae)
 {
	 System.out.println("in ae catch");
 }	 
	}
}
