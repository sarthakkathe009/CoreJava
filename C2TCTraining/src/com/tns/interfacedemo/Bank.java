package com.tns.interfacedemo;

public interface Bank {
	public static final float INR=8.56f;
	static final int MIN_BALANCE=3000;
	static final int DEPOSIT_LIM =60000;
	
	void deposit(int amt);
	void withdraw(int amt);
	
	default void display()
	{
		System.out.println("Concrete Method");
	}
}
