package com.tns.generics;

import java.util.*;
public class UpperBoundedWildcard {
	
	public static void display(List<? extends Number> list) {
		for(Object n:list) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(98,26,67);
		System.out.println("Intger--> Display Values");
		display(l1);
		
		List<Double> l2=Arrays.asList(12.63,89.28,74.92);
		System.out.println("Double--> Display Values");
		display(l2);
	}

}
