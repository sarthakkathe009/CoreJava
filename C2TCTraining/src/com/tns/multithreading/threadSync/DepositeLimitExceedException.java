package com.tns.multithreading.threadSync;

public class DepositeLimitExceedException extends Exception{
	public DepositeLimitExceedException() {
		super("Limit Exceed!!");
	}
	public DepositeLimitExceedException(String s) {
		super(s);
	}
}
