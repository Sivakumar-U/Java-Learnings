package com.siva.oops.JDK8_features;

/*
 * Interface Implemented by Lambda Expression.
 */
public class Interface_Implemented_By_Lambda_Expression {

	public static void main(String[] args) 
	{
		Test2 t = () -> System.out.println("fun"); // Lambda Expression.
		t.fun();

	}

}

interface Test2 {
	public void fun();
}
