//Thread Synchronization
package com.tns.multithreading.threadSync;

public class Account implements Bank {
	private int accNo;
	private String name;
	private int bal;
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
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public Account(int accNo, String name, int bal) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [AccNo=" + accNo + ", Name=" + name + ", Balance=" + bal + "]";
	}
	@Override
	public synchronized void deposite(int amt) throws DepositeLimitExceedException {
		try {
		if(amt>25000) {
			throw new DepositeLimitExceedException();
		}
		else {
			bal+=amt;
			System.out.println("Deposited Amount: "+amt);
		     }
		}
		catch(DepositeLimitExceedException d){
			System.err.println(d.getMessage());
		}
	}
	@Override
	public void withdraw(int amt) throws InsufficientBalanceException {
		if((bal-amt)<MINBAL) {
			throw new InsufficientBalanceException();
		}
		else {
			bal -= amt;
			System.out.println("After withdrawal Rs." + amt + ", Current Balance : Rs." + bal);
		}
		
	}
	
	
}
