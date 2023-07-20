package com.tns.inbuiltclass;

public class CommondLine {

	public static void main(String args[]) {
		System.out.println("Passed in Console: "+ args[0]);
		int a;
		a=Integer.parseInt(args[1]);//parseInt - String to int
		System.out.println("Integer value : "+a);
		int b=a;
		int c=a+b;
		System.out.println("Sum: "+c);
	}

}