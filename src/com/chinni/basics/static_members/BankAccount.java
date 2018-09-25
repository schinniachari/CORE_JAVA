package com.chinni.basics.static_members;

import java.util.*;
class  BankAccount
{
	 static final String bname;
	 
	 static final String branch;
 
	 static final String ifsc;
	 
	 static{ 
		 	 System.out.println(" inside static block");
	 System.out.println(" enter bank name ");
	 Scanner sc1 =new Scanner(System.in);
	 bname=sc1.nextLine();
	 System.out.println(" enter branch name ");
	 Scanner sc2 =new Scanner(System.in);
	 branch=sc2.nextLine();
	 System.out.println(" enter ifsc code ");
	 Scanner sc3 =new Scanner(System.in);
	ifsc=sc3.nextLine();
 }
static void display(){
		 System.out.println("bank name is      :::"+bname);
		  System.out.println("branch name is   :: "+branch);
 System.out.println          ("ifsc code is       ::: "+ifsc);}
 }
