package com.tns.abstraction;

public class ExecutorClass {

	public static void main(String[] args) {
		Shape s;
		s=new Circle(54.7f);
		//dynamic binding
		s.calArea();
		System.out.println(s);
		
		s=new Square(3.0f);
		s.calArea();
		System.out.println(s);
		
		s=new Sphere(1.5f);
		s.calVolume();
		System.out.println(s);
	}

}
