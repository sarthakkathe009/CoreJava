package com.tns.multithreading;

public class ThreadDemo extends Thread {
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(Thread.currentThread()+" : "+i);
			//The currentThread() method of thread class is used to return a reference to the 
			//currently executing thread object.
			
			try {
				Thread.sleep(500);/*try/catch is used because Thread.sleep()method throws 
				                    InterruptedException in Thread Class(Predefined)*/
			}
			catch(InterruptedException e) {
				System.err.println("Error");
			}
		}
	}
}
