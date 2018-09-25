package com.chinni.exception_handling.atm_project;

import java.util.Scanner;

public class ATMMachineUser {
 public double amt=0;
 
	public static void main(String[] args)
			throws InstantiationException, 
			       IllegalAccessException, 
			       ClassNotFoundException, 
			       InsufficientFundsException {
	 Scanner sc=new Scanner(System.in);  
	 System.out.println("please insert your card");
	 
	 String s="atm_project."+sc.nextLine();
	 System.out.println(s); 
	 ATMCard card=(ATMCard) Class.forName(s).newInstance();
	 int i=0;
	 while(i==0) {
	 System.out.println("\n what operation you want to perform \n");
	
	 switch (sc.nextLine()) {
	 case "deposite":
		 System.out.println("welcome to depositing \n how much amount you want to deposite");
		 card.deposite(sc.nextDouble());
	 break;
	 case "withDraw":
		 System.out.println("welcome to withdrawing \n how much amount you want to withdraw");
		 card.withDraw(sc.nextDouble());
		 break;
	 case "transfer":
		 System.out.println("welcome to transfer \n how much amount you want to transfer");
		 card.transfer(sc.nextDouble());
		 break;
	 case "exit":
		System.out.println("thank you visit again");
		i=20;
		 break;

	 default:System.out.println("please enter some valid operation");
		break;
	}//switch 
	}//while
	}//main 
}//class
