package com.tns.collections;


public class LinkedListExecutor {

	public static void main(String[] args) {
		LinkedListDemo ld=new LinkedListDemo();
		ld.insert(10);
		ld.insert(20);
		ld.insert(30);
		ld.insert(40);
		//ld.splitIterate();
		ld.insertFirst(0);
		ld.insertLast(60);
		ld.insertAtPosition(3,90);
		ld.display();
		ld.iterate();
		ld.reverseIterate();
		ld.reverse();
		ld.sort();
		ld.removeFirst(); ld.display(); ld.removeLast(); ld.display();
	}

}
