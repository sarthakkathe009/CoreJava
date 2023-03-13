package com.tns.inbuiltclass;

class Sample{
	
}
class Demo{
	public Demo() {
		System.out.println("In Constructor");
	}
	@Override
	protected void finalize() throws Throwable{
		//The Throwable class is the superclass of all errors and exceptions in the Java language.
		//for Cleanup instances
		System.out.println("IN FINALIZED METHOD");
	}
}


public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s=new Sample();
		Sample s1=new Sample();
		s.getClass();
		//s1.getClass();
		s1.hashCode();
		System.out.println(s);// Its retuning a varible not a method so there's a diff
		System.out.println(s1);
		Demo d=new Demo();
		System.out.println(d.hashCode());
		/*
		 * d.hashCode(); System.out.println(d);
		 */
		Demo d1=d;
		d=null;
		System.gc();
		System.out.println(d1);
		
	}

}
