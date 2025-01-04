package com.fullstack.jdbc;

public class ProductsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductsService service = new ProductsService();

		// Add Product into Products Table
		
		service.create("Laptop", 1200.50, 10);
		//service.create("CPU", 999, 6);
		
		//service.update(1, "Monitor", 1200, 8);
		
		//service.delete(2);

		// Read from the Products table
		service.read();
	}

}
