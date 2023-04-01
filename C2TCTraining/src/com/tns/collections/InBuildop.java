package com.tns.collections;
import java.util.*;
@SuppressWarnings("unchecked")
public class InBuildop {

	public static void main(String[] args) {
		List l1=new ArrayList();
		System.out.println("Size = "+l1.size());
		System.out.println("Checking is Empty: "+l1.isEmpty());
		l1.add(50);
		l1.add(60);
		l1.add(true);
		l1.add(false);
		l1.add("hello");
		l1.add("$ DollarSign");
		//l1.add(5, "Hi");//RTE
		System.out.println(l1);
		System.out.println("Size = "+l1.size());
		System.out.println("Contains? = "+l1.contains(50));
		System.out.println("Element at 4th position = "+l1.get(4));
		//System.out.println("Element removed "+list1.remove(16)); //RTE
		System.out.println("Removed : "+l1.remove(4));//4 = Index Position
		System.out.println(l1);
		System.out.println("Index : "+l1.indexOf(false));
		System.out.println("Removed = "+l1.remove(l1.indexOf(60)));
		l1.clear();
		System.out.println("List= "+l1);
	}

}
