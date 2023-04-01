package com.tns.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
//		UsingRunnable r1=new UsingRunnable(10,200,"Hello");
		//Anonymous Class
//		 Runnable r1 = new Runnable() {
//		 @Override public void run() {  
//			 for(int i=1;i<=5;i++)
//				 System.out.println("In Anonymous Class"); 
//			 } 
//		 };
//		 Thread t1=new Thread(r1); 
//		 t1.start();
		 
		 //Lamba Function
		 Runnable r2=()->{
			 System.out.println("IN LAMBA FUNCTION");
	     };
		 new Thread(r2).start();
		 System.out.println("End of Code");
	}
}
