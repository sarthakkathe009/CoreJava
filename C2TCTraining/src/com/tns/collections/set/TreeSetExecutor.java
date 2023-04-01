package com.tns.collections.set;


public class TreeSetExecutor {

	public static void main(String[] args) {
		TreeSetDemo td=new TreeSetDemo();
		
		td.insert("Red");
		td.insert("Blue");
		td.insert("Green");
		td.insert("Orange");
		td.insert("Voilet");
		td.insert("Yellow");
		td.display();
		td.headset("Green");
		td.subset("Green","Yellow");
		td.tailset("Red");
		td.reverse();
		td.delete();
		td.display();
	}

}
