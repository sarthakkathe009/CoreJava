package com.tns.abstraction;

abstract public class Shape {
	protected float area;
	protected float vol;
	protected static final float PI=3.14f;
	protected static final float AB=1.33f;
	
	void show() {
		System.out.println("In show()");
	}
	
	public abstract void calArea(); 
	public abstract void calVolume();
}
