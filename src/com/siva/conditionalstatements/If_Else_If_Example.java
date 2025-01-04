package com.siva.conditionalstatements;

/*
if-else-if: In case of more than 2 situations.
Check the shape is Triangle/ Rectangle/ Pentagon/ Other?
 */
public class If_Else_If_Example {

	public static void main(String[] args) {
		
		int sides = 4;
		if(sides == 3)
			System.out.println("Triangle Shape");
		else if(sides == 4)
			System.out.println("Rectangle/ Square Shape");
		else if(sides == 5)
			System.out.println("Pentagon Shape");
		else
			System.out.println("Other Shape");

	}

}
