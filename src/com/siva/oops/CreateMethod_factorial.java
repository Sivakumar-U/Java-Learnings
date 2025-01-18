	package com.siva.oops;
	
	public class CreateMethod_factorial {
	
		public static void main(String[] args) {
			Program.factorial(5);
	
		}
	
	}
	
	class Program {
		public static void factorial(int num) {
			int fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
	
		}
	}
