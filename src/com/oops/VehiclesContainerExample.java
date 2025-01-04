package com.oops;

import java.util.Scanner;

public class VehiclesContainerExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		VehiclesContainer container = new VehiclesContainer();

		String input = "";

		do {
			System.out.println("=========================================");
			System.out.println("Enter \"add\" to add new vehicle to container: ");
			System.out.println("Enter \"show\" to show vehicles in container: ");
			System.out.println("Enter \"quit\" to quit the program: ");

			input = sc.next();

			switch (input) {
			case "add":
				container.addVehicle();
				break;
			case "show":
				container.showVehicles();
				break;
			case "quit":
				break;
			default:
				System.out.println("Invalid input, please enter any of listed option");
				break;
			}
		} while (!input.equals("quit"));

		sc.close();
	}

}
