package com.tns.multithreading;

public class ChildThread extends Thread {
	int n;
	String s;
	
	public ChildThread(int n,String s) {
		this.n=n;
		this.s=s;
	}
	@Override
	public void run() {
		for(int i=0;i<n;i++) {
			System.out.println(i+" --> "+s);
			try {
				Thread.sleep(300);
			}
			catch(Exception e) {
				e.getMessage();
			}
		}
	}
}
