package com.fullstack.threads;

/**
 * Demonstrate the Java MultiThreading by creating the threads
 */
class MyThread extends Thread {

	// This is thread constructor
	public MyThread(String name) {
		super(name);
	}

	//This is run method
	public void run() {
		System.out.println("Hello, This is run method of thread, Thread is in running state " + this);
	}
}

public class CreateThreadExample {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread("First Thread");
		MyThread thread2 = new MyThread("Second Thread");
		MyThread thread3 = new MyThread("Third Thread");

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
