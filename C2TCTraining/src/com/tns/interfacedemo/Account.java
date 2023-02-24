package com.tns.interfacedemo;

public class Account implements Bank {
	private int accNo;
	private String name;
	private int balance;
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) {
		if(amt>DEPOSIT_LIM)
			System.err.println("Can't Deposite! Limit Exceed");
			
		else
			balance+=amt;
			
	}

	@Override
	public void withdraw(int amt) {
		if(balance-amt>=MIN_BALANCE)
			balance-=amt;
		else
			System.err.println("You Cant Withdraw");
		
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
