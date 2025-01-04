package com.siva.conditionalstatements;

/*
 Give 20% discount only on minimum bill amount is 5000.
 */
public class CustomerBillExample3 {

	public static void main(String[] args) {
		
		double bill = 7000;
		if(bill >= 5000) 
		{
			double discount = 0.20*bill;
			bill = bill - discount;
		}
		System.out.println("Pay : "+ bill);

		
	}

}

/*
bill = 3000 => 0 discount => Pay : 3000
bill = 8000 => 8000 - 1600 => Pay : 6400 
*/
