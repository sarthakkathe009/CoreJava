package com.tns.collections.set;

import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {
	void addElement1(HashSet<Integer> hs) {
		hs.add(50);
		hs.add(90);
		hs.add(110);
		hs.add(30);
		hs.add(70);
		hs.add(20);
	}
	void addElement2(HashSet<Integer> hs) {
		hs.add(80);
		hs.add(140);
		hs.add(10);
		hs.add(110);
		hs.add(70);
		hs.add(60);
	}
	void display(HashSet<Integer> hs) {
		System.out.println(hs);
		}
	void equal(HashSet<Integer> hs,HashSet<Integer> hs1) {
		int sz,sz1;
		sz=hs.size();
		sz1=hs1.size();
		if(sz==sz1)
		{
		System.out.println("Equal Size");
		}
		else {
			System.out.println("NotEqual Size");
		}
	}
	//Union Of Set
	void union(HashSet<Integer> hs1,HashSet<Integer> hs2) {
		hs1.addAll(hs2);
		System.out.println("Union of Set: "+hs1);
	}
	//Intersection of Set
	void common(HashSet<Integer> hs1,HashSet<Integer> hs2) {
		hs1.retainAll(hs2);
		System.out.println("Intersection of Set: "+hs1);
	}
	//Difference of Set
	void setDiff(HashSet<Integer> hs1,HashSet<Integer> hs2) {
		hs1.removeAll(hs2);
		System.out.println("Difference: "+hs1);
	}
	//SplitIterator-trysplit()
	void splitSet(HashSet<Integer> hs) {
		Spliterator<Integer> si=hs.spliterator();
		Spliterator<Integer> si1=si.trySplit();
		si1.forEachRemaining(System.out::println);
		System.out.println("------");
		si.forEachRemaining(System.out::println);
	}
	//SplitIterator
	void iterate(HashSet<Integer> hs1) {
		//SplitIterator 
		Spliterator<Integer> spit=hs1.spliterator();
		spit.forEachRemaining(System.out::println);
	}
	
}
