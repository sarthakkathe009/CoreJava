package com.tns.exceptionhandling;

public class WithExceptionHandled {

	public static int intDivision(int a,int b) {
		return a/b;
	}
	public static float floatOut(int a,int b) {
		return a/b;
	}
	public static float floatDivision(float a,float b) {
		return a/b; 
	}
	
	public static void main(String[] args) {
		try {
		System.out.println("INT DIVISION RESULT: "+intDivision(10,20));
		System.out.println("FLOAT RETURN TYPE DIVISION RESULT: "+floatOut(30,10));
		System.out.println("FLOAT DIVISION RESULT: "+floatDivision(10.50f,5.40f));
		System.out.println("DIVISION RESULT: "+intDivision(10,0));//RTE
		}
		catch(Exception e) {
			System.err.println("Error!!!---"+e.getMessage());
		}
		System.out.println("----End of Code----");
	}

}
