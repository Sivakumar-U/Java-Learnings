package com.siva.oops.JDK8_features;

/*
 * interface implemented by Anonymous inner class.
 * Anonymous class is a class that is defined without a name.
 */
public class Interface_implemented_By_Anonymous_Class {

	public static void main(String[] args) 
	{
		Test1 t = new Test1() 
		{
			public void fun() {
				System.out.println("fun");
			}
		};
		t.fun();

	}

}

interface Test1 {
	public void fun();
}
