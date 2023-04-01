package com.tns.collections;
import java.util.*;

public class ArrayListOp {
	List<Integer> ls=new ArrayList<Integer>();
	void insert(int a) {
		ls.add(a);
	}
	
	void print() {
		System.out.println("List = "+ls);
	}
	
	void remove(int a) {
		ls.remove(a);
	}
	
	void reverse() {
		Collections.reverse(ls);
		System.out.println("List = "+ls);
	}
	
	// Traversing a list
	void traverse() {
		System.out.println("  Traversing a List  ");
		Iterator<Integer> i = ls.iterator(); //Iterator has only next method
		while (i.hasNext()) {
			Integer nm = i.next();
			System.out.print(nm+" ");
		}
	}
	// Traversing a list in reverse
	void reversetraversing() {
		System.out.println();
		System.out.println("  Traversing in Reverse Order  ");
		ListIterator<Integer> i1=ls.listIterator(ls.size());
		while(i1.hasPrevious()) {
			Integer nm=i1.previous();
			System.out.print(nm+" ");
		}
	}
	
	//Sorting in ascending order
	void sortAscending() {
		System.out.println();
		Collections.sort(ls);
		System.out.println("Sorting in Ascending order " + ls);
	}
	
	//Sorting in descending order
	void sortDescending() {
		System.out.println();
		Collections.sort(ls);
		Collections.reverse(ls);
		System.out.println("Sorting in Descending order " + ls);
	}
	
}
