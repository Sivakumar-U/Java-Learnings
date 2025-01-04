package com.oops;

import java.util.Scanner;

/**
 * Vehicle container is the main functionality which uses the encapsulated
 * classes/models This has methods to addVehicle to container and showVehicles
 * to container.
 */
public class VehiclesContainer {

	public static final int MAX_VEHICLES = 10;

	// Initializing the vehicles array with max size
	private Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];

	// To determine the count of vehicles loaded into the container
	private int count = 0;

	private Scanner sc = new Scanner(System.in);

	public void addVehicle() {
		if (count == MAX_VEHICLES) {
			System.out.println("Container is full, Cannot add more vehicles.");
		} else {
			System.out.println("Enter the type of vehicle (Car/Bike): ");
			String type = sc.next().toLowerCase();
			switch (type) {
			case "bike":
				this.vehicles[count] = addBike();
				count++;
				System.out.println("Your Bike Details are Uploaded...Thankyou!");
				break;

			case "car":
				this.vehicles[count] = addCar();
				count++;
				System.out.println("Your Car Details are Uploaded...Thankyou!");
				break;
			default:
				System.out.println("Cannot add vehicle of unknown type");

			}
		}
	}

	public void showVehicles() {
		System.out.println("========================================================");
		for (int i = 0; i < count; i++) {
			System.out.println(vehicles[i]);
		}
	}

	private Bike addBike() {
		System.out.println("Enter the model of Bike: ");
		String model = sc.next();
		System.out.println("Enter the color of Bike: ");
		String color = sc.next();
		System.out.println("Enter the type of Bike (STANDARD/SPORTS): ");
		String type = sc.next().toUpperCase();
		BikeType bikeType = BikeType.getType(type);
		return new Bike(model, color, bikeType);
	}

	private Car addCar() {
		System.out.println("Enter the model of Car: ");
		String model = sc.next();
		System.out.println("Enter the color of Car: ");
		String color = sc.next();
		System.out.println("Enter the type of Car (SUV/SEDAN/SPORTS): ");
		String type = sc.next().toUpperCase();
		CarType carType = CarType.getType(type);
		return new Car(model, color, carType);
	}

}
