package com.tns.multithreading;

public class ThreadExecutor {

	public static void main(String[] args) {
		System.out.println("In main()");
		ThreadDemo t1=new ThreadDemo();
		t1.setName("First Thread");
		t1.start();
		ThreadDemo t2=new ThreadDemo();
		t2.setName("Second Thread");
		t2.start();
		
//		ThreadDemoConstructor t3=new ThreadDemoConstructor("First Thread");
//		ThreadDemoConstructor t4=new ThreadDemoConstructor("Second Thread");
//		System.out.println(t3);
		//t3.start();
		//Thread.sleep(50);
		System.out.println("End of main()");
		
	}

}
