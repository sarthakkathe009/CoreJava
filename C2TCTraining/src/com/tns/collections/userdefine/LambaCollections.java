package com.tns.collections.userdefine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambaCollections {

	public static void main(String[] args) {
		List<Student> ls=new ArrayList<Student>();
		Student s1=new Student(1,"Messi",96.30f);
		ls.add(s1);
		s1=new Student(2,"Ronaldo",94.60f);
		ls.add(s1);
		s1=new Student(3,"Neymar",89.34f);
		ls.add(s1);
		s1=new Student(4,"Hakimi",75.34f);
		ls.add(s1);
		System.out.println(ls);
		System.out.println("\n");
		Comparator<Student> com=(st1,st2)->(int)(st1.getPer()-st2.getPer());
		Collections.sort(ls,com);
		System.out.println("Sorting Students by Per: "+ls);
		
		System.out.println("\n");
		Collections.reverse(ls);
		System.out.println("Sorting in Descending order: "+ls);
		
		System.out.println("\n");
		Comparator<Student> com1 = (st1, st2) -> st1.getName().compareTo(st2.getName());
		Collections.sort(ls,com1);
		System.out.println("Sorting by Name: "+ls);
	}

}
