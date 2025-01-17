package com.siva.loop_examples;

/*Print sum of factors except itself is equals to same number.
n = 6
i= 1 2 3 4 5 6
sum = 1+2+3 = 6 (means where 6 also divisible with 6 but except 6 the answer should get 6).
*/
public class PerfectNumber {

	public static void main(String[] args) {
		int n = 6;
		int sum = 0;
		for (int i = 1; i < n - 1; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (n == sum) {
			System.out.println(n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");
		}

	}

}
