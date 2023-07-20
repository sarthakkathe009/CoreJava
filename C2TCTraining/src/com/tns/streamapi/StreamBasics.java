package com.tns.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SuppressWarnings("all")
public class StreamBasics {

	public static void main(String[] args) {
		//Creating stream from set of values
		Stream<Integer> stream=Stream.of(10,20,30,40,50,60);
		
		//Counting no. of Elements
		System.out.println("No. of Elements: "+stream.count());
		//stream.forEach(System.out::println);
		
		//creating stream of Arrays
		Integer[] values=new Integer[] {15,25,35,15,55};
		stream=Arrays.stream(values);
		
		// map
		System.out.println("Squares of " + Arrays.toString(values) + " is as follows :");
		stream.map(num->num*num).forEach(System.out::println);
		
		//limiting values
		System.out.println("First 2 Elements : ");
		Arrays.stream(values).limit(2).forEach(System.out::println);//method reference
		
		// skiping values
		System.out.println("Elements excepts first 4 : ");
		Arrays.stream(values).skip(3).forEach(System.out::println);
		
		//distinct
		System.out.println("Distinct values : ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> words=Arrays.asList("Which","What","When");
		Stream stream1=words.stream();
		stream1.forEach(ele->System.out.print(ele+" "));
		
		//map
		System.out.println();
		System.out.println("Elements in UpperCase: ");
		List<String> list1=words.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(list1);
		
		stream1=words.stream();
		stream1.map(str->((String) str).toLowerCase());
		System.out.println(words);
	}

}
