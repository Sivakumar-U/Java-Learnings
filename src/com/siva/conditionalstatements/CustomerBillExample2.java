package com.siva.conditionalstatements;

/*
 Give 20% discount on every bill
 */
public class CustomerBillExample2 {

	public static void main(String[] args) {
		
		double bill = 8000;
		double discount = 0.20 * bill;
		bill = bill - discount;
		
		System.out.println("Pay : "+ bill);
		

	}

}
