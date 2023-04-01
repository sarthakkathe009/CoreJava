package com.tns.interThreadCommunication;

public class ServiceClass {
	int n;
	boolean valueSet=false;
	
	public synchronized void put(int n) {
		if(valueSet) {
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.n=n;
		valueSet=true;
		System.out.println("Put: "+n);
		notify();
	}
	
	public synchronized void get() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Getting Data: "+n);
		valueSet=false;
		notify();
	}
}
