package com.fullstack.oops.abstraction;

public abstract class Shape {

	private String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}
	
	

}
