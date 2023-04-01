package com.tns.collections.map;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//Ordered Set
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Instagram");
		ts.add("Facebook");
		ts.add("Twitter");
		ts.add("WhatsApp");
		//ts.add("WhatsApp");//No repeated Values
		System.out.println("Social NetWorking Platforms: "+ts);
		//Backed Collection - views of a particular section of the larger collection .
		Set<String> subset=ts.subSet("Instagram",true,"WhatsApp",true);
		System.out.println("--Subset--"+subset);
		
		ts.add("Snapchat");
		ts.add("Tinder");
		System.out.println("After Add More PFs: "+ts);
		System.out.println(subset);
		
		ts.remove("Tinder");
		System.out.println("After Removal: "+ts);
		System.out.println(subset);
		
		// Adding User defined objects in TreeSet
		//Sorting by name
		Comparator com=(s1,s2)->(int)((Student) s1).getName().compareTo(((Student) s2).getName());
		TreeSet<Student> students = new TreeSet<Student>(com);
		students.add(new Student(101, "Harshita", 87));
		students.add(new Student(104, "Pallavi", 71));
		students.add(new Student(103, "Anisha", 67));
		students.add(new Student(102, "Sheetal", 72));
		System.out.println("Student details are as follows\n" + students);
		
		
	}

}
