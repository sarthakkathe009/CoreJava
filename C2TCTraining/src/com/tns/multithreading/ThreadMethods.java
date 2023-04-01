package com.tns.multithreading;

public class ThreadMethods {

	public static void main(String[] args) {
		ChildThread ct=new ChildThread(1,"Concat");// creating child thread object 
		ChildThread ct1=new ChildThread(10,"Addd");// creating child thread object
		System.out.println("Current Thread: "+Thread.currentThread());// returns current thread
		ct.start();
		ct1.start();
		Thread.currentThread().setName("Super Thread");// assign name to thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // changing priority of the thread
		System.out.println("Current Thread : " + Thread.currentThread());// returns current thread
		try {
			ct.join();
			ct.join(500);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End of main()");
	}

}
