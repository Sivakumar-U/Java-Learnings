package com.siva;

public class ReverseAString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String line = "This is java string";
		String[] arr = line.split(" ");
		
		for(String s : arr){
			for(int i=s.length()-1; i>=0; i--) {
				System.out.print(s.charAt(i));
			}
			System.out.print(" ");
		}

	}

}
