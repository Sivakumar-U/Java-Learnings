package com.siva.oops.JDK8_features;

public class FunctionalInterface_With_Method1
{

	public static void main(String[] args) 
	{
		Say s = () -> System.out.println("hello");
		s.hello();

	}

}

@FunctionalInterface
interface Say 
{
	public void hello(); // Method with No Arguments and No Return Values in interface.
}
