package com.tns.abstraction;

public class Triangle extends Shape{
	private float base;
	private float height;
	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public void calArea() {
		super.area=0.5f*base*height;
		
	}
	@Override
	public void calVolume() {
		// TODO Auto-generated method stub
		
	}
	
	
}
