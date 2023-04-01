package com.tns.multithreading;

public class UsingRunnable implements Runnable {
	Thread t;
	int h,l;
	String name;
	
	public UsingRunnable(int h,int l,String name) {
		this.h=h;
		this.l=l;
		this.name=name;
		t = new Thread(this,"Child Thread");
		t.start();
		}
	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			h++;l++;
			System.out.println(Thread.currentThread()+(i+" "+h+"---"+l+" "+name));
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		
	}	
}

	

