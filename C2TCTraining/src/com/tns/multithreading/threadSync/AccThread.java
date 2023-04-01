package com.tns.multithreading.threadSync;

public class AccThread extends Thread {
	private Account acc;
	private int amt;
	
	public AccThread(Account acc,int amt) {
		this.acc=acc;
		this.amt=amt;
		start();
	}
	
	@Override
	public void run() {
		try {
		synchronized(acc) {
				acc.withdraw(amt);
		    } 
		}
		catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		}
	}
}
