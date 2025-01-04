package com.siva;

public class ReturnStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 20; i++) {
			if (i == 15) {
				 return;
				// break;
				//continue;
			}
			System.out.println("current value :" + i);
		}

	}

}
