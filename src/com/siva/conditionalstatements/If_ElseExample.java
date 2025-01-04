package com.siva.conditionalstatements;

/*
if-else: execute else-block directly when if condition is invalid.
						(It is Either-Or situation)
Check the person can vote or not. 
*/
public class If_ElseExample {

	public static void main(String[] args) {
		
		int age = 17;
		if(age >= 18) {
			System.out.println("You can vote");
		}
		else {
			System.out.println("You cannot vote");
		}

	}

}
