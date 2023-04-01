package com.tns.generics;

public class ConstructorGenerics {
	double d;
	public <T extends Number>ConstructorGenerics(T t){
		d=t.doubleValue();
	}
	void show() {
		System.out.println("Converted Doubles : "+d);
	}
	
	public static void main(String[] args) {
		ConstructorGenerics cg=new ConstructorGenerics(50);
		cg.show();
		
		ConstructorGenerics cg1=new ConstructorGenerics(56.32f);
		cg1.show();
	}
}
