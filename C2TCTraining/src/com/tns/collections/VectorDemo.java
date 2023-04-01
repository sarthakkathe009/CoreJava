package com.tns.collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

@SuppressWarnings("unchecked")
public class VectorDemo {
	Vector<Integer> vi=new Vector<Integer>(); 
	void insert(int a) {
		vi.add(a);
	}
	void display() {
		System.out.println("Vector is: "+vi);
	}
	void returnSize() {
		System.out.println("Size of Vector is : "+vi.size());
	}
	void contain(int a) {
		System.out.println(a+" is present in list: "+vi.contains(a));
	}
	void returnFirstElement() {
		System.out.println("First element of the Vector is: "+vi.firstElement());;
	}
	void returnLastElement() {
		System.out.println("Last element of the Vector is: "+vi.lastElement());
	}
	void delete(int a) {
		System.out.println("Remove first occourence of element "+a+": "+vi.removeElement(a));
	}
	void deleteIndex(int a) {
		try {
			System.out.println("Remove element at index "+a+" :"+vi.remove(a));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	void iterate() {
		 Iterator<Integer> itr = vi.iterator();  
		 System.out.print("Iteration--> ");
         while(itr.hasNext()){  
              System.out.print(itr.next()+" ");  
         }
         System.out.println();
	}
	void sort() {
		 //Sorting the vector  
        Collections.sort(vi);
        System.out.println("Sorted VectorList---> "+vi);
	}
	void duplicate() {
		Vector<Integer> vc=new Vector<Integer>();
		vc=(Vector<Integer>) vi.clone();
		System.out.print("Elements in Clone Vector: ");
		for(Integer nm:vc) {
			System.out.print(nm+" ");
		}
	}
}
