package com.chinni.exception_handling.exception_handling;

 class TestTT{
void m1() throws InterruptedException{
try
	 { 		 
		 if (false)
{
throw new InterruptedException();
}
// throw new ArithmeticException();
	 }
	  	 catch (ArithmeticException ae)
	 {			System.out.println("in catch.m1");
	 }
    catch (InterruptedException ie)
	 {			System.out.println("in catch.m1");
	 }	 
		
// System.out.println("in m1 method as TestTT")	;
 }

 }