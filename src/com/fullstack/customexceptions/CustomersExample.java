package com.fullstack.customexceptions;

import java.util.List;
import java.util.Optional;

public class CustomersExample {

	public static void main(String[] args) {

		List<Customer> customers = List.of(new Customer(101, "customer1", 30, 'M', true),
				new Customer(102, "customer2", 40, 'F', false), new Customer(103, "customer3", 50, 'M', false),
				new Customer(104, "customer4", 60, 'F', true), new Customer(105, "customer5", 70, 'M', true));

		try {
			System.out.println(search(101, customers));
			System.out.println(search(102, customers));
			System.out.println(search(110, customers));

			Customer customer1 = search(101, customers);
			Customer customer2 = search(102, customers);
			Customer customer3 = search(110, customers);

			System.out.println("Customer mobile number: " + customer1.getMobile());
			System.out.println("Customer mobile number: " + customer2.getMobile());
			System.out.println("Customer mobile number: " + customer3.getMobile());

		} catch (CustomerNotFoundException e) {
			System.out.println("Customer not found exception has occured and is handled within try-catch block");
			System.out.println(e.getMessage());
		} catch (CustomerNotActiveException e) {
			System.out.println("Customer not active exception has occured and is handled within try-catch block");
			System.out.println(e.getMessage());
		}

	}

	public static Customer search(Integer id, List<Customer> customers)
			throws CustomerNotFoundException, CustomerNotActiveException {

		Optional<Customer> customer0 = customers.stream().filter(cust -> cust.getId().equals(id)).findAny();

		if (customer0.isEmpty())
			throw new CustomerNotFoundException("Customer not found with id: " + id);

		Customer customer = customer0.get();

		if (!customer.getActive())
			throw new CustomerNotActiveException("Customer not active with id: " + id);

		return customer;

	}

}
