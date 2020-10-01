package com.hsbc.model.exception;

public class AuthenticationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuthenticationException() {
		super("Sorry, invalid credentials");
	}

	public AuthenticationException(String message) {
		super(message);
	}
	
}
