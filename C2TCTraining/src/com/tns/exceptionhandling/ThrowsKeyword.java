package com.tns.exceptionhandling;

public class ThrowsKeyword {

	public static int count(String s) throws NullPointerException {
		int ct=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isWhitespace(c))
				ct++;
		}
		return ct++;
	}
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println("Count of WhiteSpaces: "+count("I am Coding in JAVA"));
			System.out.println("Count of WhiteSpaces: "+count(s));
		}
		catch(Exception e) {
			System.err.println("Error! String cannot be Null ");
		}
	}

}
