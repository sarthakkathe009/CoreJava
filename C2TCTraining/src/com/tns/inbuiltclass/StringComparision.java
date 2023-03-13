package com.tns.inbuiltclass;

public class StringComparision {

	public static void main(String[] args) {
		String s="STRINGPOOL";
		String s1="STRINGPOOL";
		
		String s11=new String("STRINGPOOL");
		String s12=new String("STRINGPOOL");
		
		System.out.println("Varibale(s)==Variable(s1)-->"+(s==s1));
		System.out.println("Object(s11)==Object(s12)"+(s11==s12));
		System.out.println("Varible(s) equal() Varible(s1)--->"+s.equals(s1));
		System.out.println("Object(s11) equal() Object(s12)-->"+s11.equals(s12));
		System.out.println("Variable(s)==Object(s11)-->"+(s==s11));
		System.out.println("Varible(s1) equal() Object(s12)-->"+(s1.equals(s12)));
		
		System.out.println("HashCode of Variables");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println("HashCode of Objects");
		System.out.println(s11.hashCode());
		System.out.println(s12.hashCode());
		
		//Comparision
		System.out.println("In compare(): "+s.compareTo(s1));
		System.out.println("In compare() lowercase: "+(s.compareTo("stringpool")));
		System.out.println("In comparetoIgnore(): "+(s1.compareToIgnoreCase("stringpool")));
		
		
	}

}
