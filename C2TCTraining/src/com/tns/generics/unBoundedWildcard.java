package com.tns.generics;

import java.util.*;

public class unBoundedWildcard {
	
	public static void display(List<?> list) {
		for(Object n:list) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		List<Integer> l1=Arrays.asList(9,8,7);
		System.out.print("Intger--> Display Values: ");
		display(l1);
		
		Person[] p=new Person[]{new Person("Madara","Hidden Leaf"),new Person("Dedara","Hidden Mist")};
		List<Person> l2=Arrays.asList(p);
		display(l2);
	}

}
