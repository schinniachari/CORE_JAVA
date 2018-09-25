package com.chinni.exception_handling.atm_project;
 

public class ICICIATMCard implements ATMCard {
 public double amt=0;

	@Override
	public void withDraw(double a) { 
		validateAmount();
	this.amt=this.amt-a;
	System.out.println("CONGRATS YOU HAVE WITHDRAWN "+a+" AVAILABLE BALANCE IS "+this.amt);
 	
	}


	@Override
	public void deposite(double a) { 
		validateAmount();
	this.amt=this.amt+a;
	System.out.println("CONGRATS YOU HAVE DEPOSITED "+a+ " AVAILABLE BALANCE IS "+this.amt);
 		
	}

	@Override
	public void transfer(double a) { 
		validateAmount();
	this.amt=this.amt-a;
	System.out.println("CONGRATS YOU HAVE TRANSFERED "+a+" AVAILABLE BALANCE IS "+this.amt);
 		
	}

	private void validateAmount() {
		if(amt<=0) {
			try {
				throw new InsufficientFundsException();
			} catch (InsufficientFundsException e) {
			   e.printStackTrace();
			   System.exit(0);
			}
		}
	 }
}
