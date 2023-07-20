package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Mumbai","Nashik","","Pune","Hyadrabad","");
		System.out.println("List of City: "+list);
		
		Stream<String> stm=list.stream();
		
		long count=StreamFunctions.countEmptyString(stm);
		System.out.printf("List %s has %d empty strings \n", list, count);
		
		int n=5;
		count=StreamFunctions.countString(list.stream(),n);
		System.out.printf("List %s has %d string of length more than %d",list,count,n);
		System.out.println();
		
		List<String> nEmpStr=StreamFunctions.nonEmptyStringList(list.stream());
		System.out.printf("Original List : %s\nList without Empty Strings: %s",list,nEmpStr);
		System.out.println();
		
		List<String> str=StreamFunctions.getStrings(list.stream(),n);
		System.out.printf("List of Cities more than length %d: %s",n,str);
		System.out.println();
		
		List<Integer> intlist=Arrays.asList(9,5,7,9,3,4,4);
		Stream<Integer> sm=intlist.stream();
		
		List<Integer> sqlist=StreamFunctions.getSquaredList(sm);
		System.out.printf("Squared List of Original list %s Without Duplicate Int:\n %s",intlist,sqlist);
		System.out.println();	
		
		StreamFunctions.showStatistics(intlist.stream());
		
	}

}
