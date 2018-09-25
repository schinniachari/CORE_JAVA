package com.chinni.exception_handling.exception_handling;

public class FinallyTestCases {

	public static void main(String[] args) {
		int i=0;
   while(i++<=4){
		try {
			System.out.println("in try");
			//System.out.println(10/0);
			System.exit(0);
		}
		/*		if(i==2){
					System.out.println("******************in if ****************");
				    return;
				}
				
			} catch (ArithmeticException e) {
				System.out.println("in catch");			 
				
			} catch (NullPointerException e) {
			System.out.println("in catch");			 
			}*/
finally{
			System.out.println("in finally ");
		}
		System.out.println("after try catch finally");
	}//while
	}//main

}//class
