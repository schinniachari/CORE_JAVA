package com.chinni.exception_handling.exception_handling;

class TC5
{
	public static void main(String[] args)  { 
	 for (int i=1;i<=10 ;i++ ){
		  System.out.println("inloop ::"+i);
	  try{	
		  System.out.println("in  try"+i);
		if (i==5)
		{
			continue;
		}
	  }
finally{
System.out.println("in finally ae"+i);
}
 System.out.println("after final");
}
 	System.out.println(" after lop");
	}
}
