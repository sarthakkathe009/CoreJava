package com.tns.interThreadCommunication;

public class Producer extends Thread {
	ServiceClass sc;
	
	public Producer(ServiceClass sc) {
		this.sc=sc;
		start();
	}
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			sc.put(i);
			i++;
			if(i==10) break;
		}
	}
}
