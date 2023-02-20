package com.tns.demo;

public class EmployeeDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("Emiway Bantai");
		p1.setCity("Mumbai");
		System.out.println(p1);
		
		Employee e1=new Employee("MC Stan","Pune",100000000,"Hiphop");
		System.out.println(e1);
		
	}

}
