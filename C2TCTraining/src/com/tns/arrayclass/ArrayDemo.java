package com.tns.arrayclass;

public class ArrayDemo {

	public static void main(String[] args) {
		int n=10;
		int a[];//declaration
		a=new int[n];//instantiation
		
		Operations.printArrays(a);
		for(int i=0;i<a.length;i++) {
			a[i]=i*5;
		}
		Operations.printArrays(a);
		int b[]= {99,89,79,69};
		Operations.printArrays(b);
		System.out.println("Sum: "+Operations.sum(b));
		System.out.println("Sum: "+Operations.sum(10,20,30));
		System.out.println("Sum: "+Operations.sum(60,50,40,30,20,10));
		
		//b[40]=10;//RTE--RunTimeError
		
		b[3]=59;
		b[2]=12;
		Operations.printArrays(b);
		System.out.println("Odd Count: "+Operations.getOddCount(b));
		System.out.println("Even Count: "+Operations.getEvenCount(b));
		
		//int c[];//CTE--CompileTimeError
	}

}
