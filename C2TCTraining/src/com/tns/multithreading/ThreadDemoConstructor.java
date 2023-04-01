package com.tns.multithreading;

public class ThreadDemoConstructor extends Thread {
	String name;
	public ThreadDemoConstructor(String name) {
		setName(this.name=name);
		start();
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name+": "+i);
		}
		try {
			Thread.sleep(200);
		}
		catch(InterruptedException i) {
			i.getMessage();
		}
	}
}
