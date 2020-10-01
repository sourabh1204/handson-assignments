package com.hsbc.model.exception;

public class ContactNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContactNotFoundException() {
		super("Sorry, contact not found");
	}

	public ContactNotFoundException(String message) {
		super(message);
	}
	
}
