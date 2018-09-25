package com.chinni.exception_handling.exception_handling;

class TC3
{
	public static void main(String[] args)  { 
	  try{	
		  System.out.println("in outer try");
			try{ 
			System.out.println(" inner try"); 
			System.out.println(3/0);
			}
	        /*catch (NegativeArraySizeException e) {
			 System.out.println("in inner catch ");
		   
			}  */
			catch (ArithmeticException e)
		 {
			 	System.out.println(" in inner catch");
				  System.out.println(3/0);
		 }
			System.out.println("after inner try/catch block");
		 }
 /*catch (ArithmeticException e)
		 {
			 	System.out.println(" in outer catch");
		 }*/ 
 catch (NegativeArraySizeException e)
			{
			 System.out.println("in inner catch ");
			}  
 /*catch (Exception e)
		 {
			 	System.out.println("No declared Exceptions are caught");
		 }*/ 
 	System.out.println(" after outer try/catch");
	}
}
