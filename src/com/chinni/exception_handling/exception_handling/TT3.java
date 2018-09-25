package com.chinni.exception_handling.exception_handling;

public class  TT3 extends TT2
{	  
  void m1() throws InterruptedException{
	 try{
	 throw new ClassNotFoundException();
	 }
	 catch(ClassNotFoundException cnfe)		 {
		 System.out.println("in  cathc TT3 cnfe");
		 throw new RuntimeException(cnfe);
	 }
 }
}