package com.fullstack.customexceptions;

public class CustomerNotActiveException extends Exception {

	public CustomerNotActiveException(String message) {
		super(message);
	}

}
