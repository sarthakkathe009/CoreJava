package com.tns.collections.set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {
	LinkedHashSet<Integer> lhset = new LinkedHashSet<Integer>();

	void insert(int a) {
		lhset.add(a);
	}
	void display() {
		System.out.println("LinkedHashSet : "+lhset);
	}
	
	/*void sort() {
		Collections.sort(lhset);	//CTE - cannot directly sort HashSet/LinkedHashSet
	}*/
	void sort(ArrayList<Integer> a1) {
		Collections.sort(a1);
		System.out.println("--After Sorting--");
		System.out.println(a1);
	}
	
	
}
