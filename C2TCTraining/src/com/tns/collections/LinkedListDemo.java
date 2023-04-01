package com.tns.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
//import java.util.Spliterator;

public class LinkedListDemo {
	LinkedList<Integer> ll=new LinkedList<Integer>();
	void insert(int a) {
		ll.add(a);
	}
	 void insertFirst(int a) {
		  ((LinkedList<Integer>) ll).addFirst(a);
	 }
	 void insertLast(int a) {
		 ll.addLast(a);
	 }
	 void insertAtPosition(int a,int b) {
		 ll.add(a,b);
	 }
	 void iterate() {
		 ListIterator<Integer> li=ll.listIterator();
		 System.out.print("Traversing ---> ");
		 while(li.hasNext()) {
			 System.out.print(li.next()+"\t");
		 }
	 }
	 void reverseIterate() {
		 ListIterator<Integer> li=ll.listIterator();
		 System.out.println();
		 System.out.print("Traversing Reverse ---> ");
		 li=ll.listIterator(ll.size());
		 while(li.hasPrevious()) {
			 System.out.print(li.previous()+"\t");
		 }
	 }
//	 void splitIterate() {
//		 Spliterator<Integer> sl=ll.spliterator();
//		 sl.forEachRemaining(System.out::println);
//	 }
	 void display() {
		 System.out.println(ll);
	 }
	 void removeFirst() {
			ll.removeFirst();	//Remove first element
		}
		void removeLast() {
			ll.removeLast();	//Remove last element
		}
		void sort() {
			Collections.sort(ll);	//sort in ascending order
			System.out.println("Number List in Ascending order is " + ll);
		}
		void reverse() {
			Collections.sort(ll);
			Collections.reverse(ll);	//sorting in descending order
			System.out.println("\nNumber List in Descending order is " + ll);
		}
}
