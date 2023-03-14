package com.tns.exceptionhandling;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Age: ");
		try {
		int age=sc.nextInt();
		if(age<18) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("Employee can have Access!!!");
		}
		    }
		catch(InvalidAgeException i) {
			System.err.println(i.getMessage());
		}
	}

}
