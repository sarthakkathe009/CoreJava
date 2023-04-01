package com.tns.abstraction;

public class Square extends Shape {
	private float side;

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	public Square(float side) {
		super();
		this.side = side;
	}
	
	@Override
	public void calArea() {
		super.area=side*side;
	}

	@Override
	public void calVolume() {
		
	}

	@Override
	public String toString() {
		return "Square --> side=" + side + ", area=" + area;
	}
	
}
