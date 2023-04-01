package com.tns.collections;
import java.util.ListIterator;
import java.util.Stack;
public class StackDemo {
	Stack<String> stk=new Stack<String>();
	void insert(String s) {
		stk.push(s);
	}
	
	void delete() {
		stk.pop();
	}
	
	void returnTop() {
		stk.peek();
	}
	
	void search(String s) {
		System.out.println("Element Found at position: "+stk.search(s));
	}
	void display() {
		System.out.println(stk);
	}
	void sizeOf() {
		System.out.println("Size of Stack is "+stk.size());
	}
	
	void iterate() {
		ListIterator<String> ls=stk.listIterator();
		System.out.print("Traversing from Begining--> ");
		while(ls.hasNext()) {
			System.out.print(ls.next()+"\t");
		}
	}
	
	void iterateRev() {
		System.out.println();
		ListIterator<String> ls=stk.listIterator(stk.size());
		System.out.print("Reverse Traversing--> ");
		while(ls.hasPrevious()) {
			System.out.print(ls.previous()+"\t");
	    }
	
	}
}
