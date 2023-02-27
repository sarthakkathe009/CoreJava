package com.tns.inbuiltclass;

public class WrapperClass {
	public static void main(String[] args)
	{
		//Integer i=new Integer(10);
		/*
		 * Float i=10.23f; int b=(int)i.floatValue(); System.out.println(b);
		 */
		
		//Unboxing
		
		  Integer i=10;
		  System.out.println("Wapper Int : " +i); 
		  int a=i.intValue();
		  System.out.println("Integer : " +a);
		//Without using intValue() 
		int b=i;
		System.out.println("Without IntValue : "+ b);
		//Autoboxing
		int c=90;
		Integer i1=c;
		System.out.println("Autoboxed :"+c);
		
	}
}
