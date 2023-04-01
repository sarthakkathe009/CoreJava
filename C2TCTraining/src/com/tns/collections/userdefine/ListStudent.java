package com.tns.collections.userdefine;
import java.util.List;
import java.util.ArrayList;
//import java.util.Collections;

public class ListStudent {

	public static void main(String[] args) {
		List<Student> ls=new ArrayList<Student>();
		Student s1=new Student(1,"Messi",96.30f);
		ls.add(s1);
		s1=new Student(2,"Ronaldo",94.60f);
		ls.add(s1);
		s1=new Student(3,"Neymar",89.34f);
		ls.add(s1);
		s1=new Student(4,"Hakimi",75.34f);
		ls.add(1,s1);
		System.out.println(ls);
		//Collections.sort(null);//RTE
		s1=ls.get(2);
		System.out.println(s1);
	}

}
