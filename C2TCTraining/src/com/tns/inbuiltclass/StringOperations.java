package com.tns.inbuiltclass;

public class StringOperations {

	public static void main(String[] args) {
		//STRINGS ARE IMMUTABLE!!!!
		String s="  In Love With, Constructors  ";//String Index starts with 0
		//String s=new String("In Love With Constructors");
		String s1=s.toUpperCase();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s.substring(1,9));
		System.out.println(s.substring(5));
		System.out.println(s.trim());//Removes Whitespaces from front and end
		System.out.println(s.strip());
		System.out.println(s.lastIndexOf('s'));
		//Returns the position of the last found occurrence of specified characters in a string
		//System.out.println(s);
		String[] ss=s.split(", ");
		for(String str:ss)
			System.out.println(str);
		//How can i store splited string in new String?
		System.out.println(s.stripLeading());//Removes the Whitespaces from Front
		System.out.println(s.stripTrailing());//Removes the Whitespaces from End
		System.out.println(s.isEmpty());
		System.out.println(s.subSequence(1,9));//Behaves Same as substring.
		
		// Comparing Two String
		s="TNS India Foundation";
		s1=new String(s);
		
		System.out.println(s+" Equals "+s1+"---->"+s.equals(s1));
		System.out.println(s+" Equals "+s1+"---->"+(s==s1));
	}

}
