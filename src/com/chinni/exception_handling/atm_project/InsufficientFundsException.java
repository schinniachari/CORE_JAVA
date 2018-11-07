package com.chinni.exception_handling.atm_project;

public class InsufficientFundsException extends Exception {
 
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super();
	}

	public InsufficientFundsException(String s) {
		super(s);
	}

}
