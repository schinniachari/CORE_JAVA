package com.chinni.exception_handling.exception_handling;

class TC7{
	public static void main(String[] args)  {  
        try{	
		  System.out.println("in  try" );
		  System.exit(0);
		   }
       finally{
        System.out.println("in finally  ");
          } 
     System.out.println("after try/final");   
	}
}