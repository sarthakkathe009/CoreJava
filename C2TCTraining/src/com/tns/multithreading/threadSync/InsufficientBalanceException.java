package com.tns.multithreading.threadSync;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {
		super("Insufficient Balance");
	}
	public InsufficientBalanceException(String s) {
		super(s);
	}
}
