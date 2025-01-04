package com.siva.conditionalstatements;

/*
if block: Block of instructions executes on valid condition.
Give 15% bonus to Employee if the Emp has min 5 years exp.
 */
public class BonusSalaryOnExperience {

	public static void main(String[] args) {
		double salary = 25000;
		int exp = 7;
		if(exp >= 5) 
		{
			double bonus = 0.15*salary;
			salary = salary + bonus;
		}
		System.out.println("Take Salary: " +salary);
		

	}

}
