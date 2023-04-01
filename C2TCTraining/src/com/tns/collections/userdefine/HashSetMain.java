package com.tns.collections.userdefine;

import java.util.HashSet;

public class HashSetMain {
	public static void addElement(HashSet<Student> hs) {
		hs.add(new Student(101,"Sarthak",89.65f));
		hs.add(new Student(102,"Shreyash",91.33f));
		hs.add(new Student(103,"Sarvesh",96.43f));
		hs.add(new Student(104,"Rohit",99.51f));
	}
	
	public static void display(HashSet<Student> hs) {
		System.out.println(hs);
	}
	
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		addElement(hs);
		display(hs);		
	}
}
