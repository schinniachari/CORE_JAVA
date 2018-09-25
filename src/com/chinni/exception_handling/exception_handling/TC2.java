package com.chinni.exception_handling.exception_handling;

class TC2 
{
	public static void main(String[] args) 
	{
		 try
		 {
		 	int a=Integer.parseInt(args[0]);
				System.out.println("a::"+a);
			try
			{
				int[] x=new int[a];
			System.out.println("length is ::"+x.length);
			}
			catch (NegativeArraySizeException e)
			{
				int[] x=new int[4];
			System.out.println("length is ::"+x.length);
			System.out.println("dont pass negative numbers as size");
			}
			int b=a+20; 
			System.out.println("b ::"+b);
		 }
		 catch (ArrayIndexOutOfBoundsException e)
		 {
			System.out.println("please pass atleast one value");
		 }
		 catch (NumberFormatException e)
		 {
			 	System.out.println(" please pass only integer values");
		 }
		 catch (Exception e)
		 {
			 	System.out.println("No declared Exceptions are caught");
		 }
	}
}
