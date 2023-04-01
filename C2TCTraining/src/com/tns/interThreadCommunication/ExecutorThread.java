package com.tns.interThreadCommunication;

public class ExecutorThread {

	public static void main(String[] args) {
		//Shared Resource
		ServiceClass sc=new ServiceClass();
		
		Producer p1=new Producer(sc);
		Customer c1=new Customer(sc);
		
		try {
			p1.join();
			c1.join();
		}
		catch(InterruptedException i) {
			System.out.println(i.getMessage());
		}
	}

}
