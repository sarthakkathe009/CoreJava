package com.tns.exceptionhandling;

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super("Access Denied");
	}
	/*
	 * public InvalidAgeException(String s) { super(s); }
	 */
}
