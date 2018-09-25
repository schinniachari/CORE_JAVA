package com.chinni.logical_programming.pascal;

import java.util.Scanner;

public class PascalTriangle {
public static void main(String[] args) {
	int row=0,col=0,space=0,nRow=0;
	Scanner scn=null;
	
	scn=new Scanner(System.in);
	System.out.println("please enter the number of rows");
	nRow=scn.nextInt();

/*
   
	 1
	1 2
   1 2 3
  1 2 3 4
  
*/	
	space=nRow-1;
	for (row = 1; row <= nRow ; row++) {
     //space generator
		for(int j=0;j<=space;j++) {
			System.out.print("  ");
		}//inner for12
		
	//to generate values
		for(col=1;col<=row;col++) { 
			
			System.out.print("  "+col); 
		}//inner for20
		
		System.out.println();
        space--;		
	}//outer for
}//main
}//class
