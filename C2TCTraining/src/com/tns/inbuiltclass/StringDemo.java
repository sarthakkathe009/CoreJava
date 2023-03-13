package com.tns.inbuiltclass;

public class StringDemo {

	public static void main(String[] args) {
		char c[]= {'D','U','B','A','I'};
		/*
		 * for(int i=0;i<c.length;i++) System.out.print(c[i]);
		 */
		String s1=new String(c);
		String s2=new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		// Using concatenation to prevent long lines.
				String longStr = "This is to show " + "how string concatination " + "can happen with additional "
						+ "operator.";

				System.out.println(longStr);
	}

}
