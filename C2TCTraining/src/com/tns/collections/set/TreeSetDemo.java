package com.tns.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	TreeSet<String> ts=new TreeSet<String>();
	
	void insert(String s) {
		ts.add(s);
	}
	void lastElement() {
		System.out.println("Highest Value: "+ts.pollLast());
	}
	void firstElement() {
		System.out.println(ts.first());
	}
	void delete() {
		ts.clear();
	}
	void display() {
		System.out.println(ts);
	}
	void reverse() {
		System.out.println("Reverse of Set: "+ts.descendingSet());
	}
	void headset(String s) {
		System.out.println("HeadSet: "+ts.headSet(s));
	}
	void subset(String a,String b) {
		System.out.println("SubSet: "+ts.subSet(a,b));
	}
	void tailset(String s) {
		System.out.println("TailSet: "+ts.tailSet(s));
	}
}
