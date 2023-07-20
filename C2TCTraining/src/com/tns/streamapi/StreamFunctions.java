package com.tns.streamapi;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {
	//Count of Empty Strings
	public static long countEmptyString(Stream<String> stream) {
		long count=0;
		count=stream.filter(str->str.isEmpty()).count();
		return count;
	}
	
	//Count of Strings larger then the given number
	public static long countString(Stream<String> stream,int n) {
		long num=stream.filter(str->str.length()>n).count();
		return num;
	}
	
	//Remove all empty Strings from list
	public static List<String> nonEmptyStringList(Stream<String> stream){
		List<String> flist=stream.filter(str->!str.isEmpty()).collect(Collectors.toList());
		return flist;
	}
	
	//Create a List with String more than n characters
	public static List<String> getStrings(Stream<String> stream,int n){
		List<String> slist=stream.filter(x->x.length()>n).collect(Collectors.toList());
		return slist;
	}
	
	// Create List of square of all distinct number
	public static List<Integer> getSquaredList(Stream<Integer> stream){
		List<Integer> slist=stream.distinct().map(i->i*i).collect(Collectors.toList());
		return slist;
	}
	
	public static void showStatistics(Stream<Integer> stream) {
		IntSummaryStatistics stats = stream.mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}
}
