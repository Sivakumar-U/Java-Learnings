package com.fullstack.oops.abstraction;

public class Rectangle extends Shape {

	private int length;

	private int width;

	public Rectangle(int length, int width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return this.length * this.width;
	}

}
