package com.tns.generics;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcard {
	public static void display(List<? super Integer> list) {
		for(Object n:list) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(1,2,3);//asList-returns new ArrayList Object 
		System.out.println("Integer--> Display Values: ");
		display(l1);
		
		List<Number> l2=Arrays.asList(10.5,8.6,3.0);
		System.out.println("Number--> Display Values: ");
		display(l2);
		
		List<Number> l3=Arrays.asList(69,46,73);
		System.out.println("Display Values: ");
		display(l3);
		
//		List<Object> l4=Arrays.asList(1.26,2.98,3.16);
//		System.out.println("Double--> Display Values: ");
//		display(l4);
	}
}
