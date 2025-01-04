package com.fullstack.customexceptions;

public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException(String message) {
		super(message);
	}

}
