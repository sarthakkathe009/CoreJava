package com.tns.interThreadCommunication;

public class Customer extends Thread {
	ServiceClass sc;
	
	public Customer(ServiceClass sc) {
		this.sc=sc;
		start();
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			sc.get();
		}
	}
}
