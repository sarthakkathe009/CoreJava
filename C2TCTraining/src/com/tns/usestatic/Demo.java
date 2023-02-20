package com.tns.usestatic;

public class Demo {

	static
	{
		System.out.println("---------------------------------------");
	}
	public static void main(String[] args) {
		System.out.println("--------------In Main----------");
		Student s1=new Student();
		s1.setName("Sakshi");
		s1.setPer(88);
		Student s2=new Student();
		s2.setName("Ishika");
		s2.setPer(90);
		Student.show();//to call Statically
		Student.show();
		System.out.println(s1);
		System.out.println(s2);
	}

}
