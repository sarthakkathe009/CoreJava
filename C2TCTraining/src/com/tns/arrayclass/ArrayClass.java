package com.tns.arrayclass;
import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int intA[]= {10,40,30,9};//Get Array
		System.out.println(Arrays.toString(intA));//To print Array in one line
		Arrays.sort(intA);
		System.out.println("After Storting->"+Arrays.toString(intA));
		/*
		 * for(int n:intA) System.out.print(n+"\t");
		 */
		int intKey = 9;

		// Print the key and corresponding index
		System.out.println(intKey + " Found at Index = " + Arrays.binarySearch(intA, intKey));

		System.out.println(intKey + " Found at Index = " + Arrays.binarySearch(intA, 1, 3, intKey));
		//Why it Returns -2?//ans:if its not found negative sign occurs
		
		System.out.println("First Array: "+Arrays.toString(intA));
		
		int intB[]= {86,23,10,56};
		System.out.println("Second Array: "+Arrays.toString(intB));
		//Comparing two operators
		//System.out.println(Arrays.compare(intA,intB));
		if(Arrays.compare(intA,intB)==0)
			System.out.println("Arrays are Equal");
		else
			System.out.println("Arrays are not Equal");
		
		//Copy of the Array
		int intA1[]=Arrays.copyOf(intA,10);
		System.out.println("Copy of IntA: "+Arrays.toString(intA1));
		
		//To copy the array into an array of new length
		int intA2[]=Arrays.copyOfRange(intA,1,5);
		System.out.println("Copy of IntA(1): "+Arrays.toString(intA2));
		
		//one of the Sorting Technique
		 // Arrays.parallelSort(intA); System.out.println(Arrays.toString(intA));
		 
		int c=100;
		Arrays.fill(intA2,c);
		System.out.println("After Filling Element: "+Arrays.toString(intA2));
			
		
		
	}

}
