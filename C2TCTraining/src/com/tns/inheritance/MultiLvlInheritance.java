package com.tns.inheritance;

public class MultiLvlInheritance {

	public static void main(String[] args) {
		Manager m1=new Manager();
		System.out.println(m1);
		Manager m2=new Manager("Atharva","Goregoan",69000,"Photography","Editing",50);
		System.out.println(m2);
		m2.show();

	}

}
