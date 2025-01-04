package com.siva;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {34, 30, 28, 18, 22, 27};
		int lowestAge = ages[0];
		
		for(int age : ages) {
			if(age < lowestAge) {
				lowestAge = age;
			}
		}
		System.out.println("The lowest age in the array is: "+lowestAge);

	}

}
