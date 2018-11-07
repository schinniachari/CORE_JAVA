package com.chinni.exception_handling.atm_project;

public class FooException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FooException() {
		super();
	}

	public FooException(String message) {
		super(message);
	}

	public FooException(String message, Throwable cause) {
		super(message, cause);
	}

	public FooException(Throwable cause) {
		super(cause);
	}
}