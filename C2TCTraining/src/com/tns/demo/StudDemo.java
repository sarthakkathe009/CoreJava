package com.tns.demo;

public class StudDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("Sarthak Kathe");
		s1.setId(10);
		s1.setPer(89.36f);
		System.out.println(s1);
		
		Student s2=new Student(20,"Shreyash Kamankar",92.10f);
		System.out.println(s2);
		
		StudentResult sr=new StudentResult(30,"Sarvesh Kadwe",95.64f);
		System.out.println(sr);
		
		StudentResult sr1=new StudentResult(40,"Rocky Bhayy",78.54f);
		System.out.println(sr1);
		
	}

}
