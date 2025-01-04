package com.fullstack.oops.interfac;

/**
 * Defining the fullstack class that implements both backend and frontend
 * interfaces.
 */
public class FullStack implements Backend, Frontend {

	// Implementing the client method from frontend interface
	@Override
	public void client() {
		// TODO Auto-generated method stub
		System.out.println("Client applications are created using Angular");
	}

	// Implementing the server method from backend interface
	@Override
	public void server() {
		// TODO Auto-generated method stub
		System.out.println("Server side programs are created using Java");

	}

}
