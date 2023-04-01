package com.tns.multithreading.threadSync;

public interface Bank {
	static final int MINBAL=5000;
	static final int DAILY_LIMIT=25000;
	
	void deposite(int amt) throws DepositeLimitExceedException;
	void withdraw(int amt) throws InsufficientBalanceException;
}
