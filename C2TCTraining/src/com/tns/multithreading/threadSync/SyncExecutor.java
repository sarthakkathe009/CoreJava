package com.tns.multithreading.threadSync;

public class SyncExecutor {

	public static void main(String[] args) {
		Account a1=new Account(10001,"Sarthak",100000);
		System.out.println(a1);
		//a1.withdraw(50000);
		// Ten account threads running parallel and sharing same resource
		AccThread art[]=new AccThread[10];
		for(int i=0;i<10;i++) {
			art[i]=new AccThread(a1,1000*(i+1));
		}
		try { for (int i = 0; i < 10; i++) { art[i].join(); } } catch
		  (InterruptedException e) { System.err.println(e.getMessage()); } 
		  // waits main thread till execution of all child thread finish
		 
		System.out.println("------------------------------------");
		System.out.println(a1);

	}

}
