package com.tns.exceptionhandling;

public class UsingFinally1 {

	public static void main(String[] args) {
		try {
			System.out.println("In try Block");
			System.out.println("----try----");
			System.exit(0);
			throw new ArithmeticException("Error");
		}
		catch(Exception e) {
			System.out.println("In catch Block"+e.getMessage());
		}
		finally
		{
			System.out.println("In finally Block");
		}
		System.out.println("---End---");
	}

}
