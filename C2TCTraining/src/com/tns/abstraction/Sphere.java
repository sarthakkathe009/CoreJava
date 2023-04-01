package com.tns.abstraction;

public class Sphere extends Shape {
	private float radius;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Sphere(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calVolume() {
		super.vol=AB*PI*radius*radius*radius;
		
	}

	@Override
	public String toString() {
		return "Sphere --> radius=" + radius + ", vol=" + vol;
	}
	
	
}
