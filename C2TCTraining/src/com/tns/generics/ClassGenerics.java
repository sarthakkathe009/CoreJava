package com.tns.generics;

public class ClassGenerics<T> {
	T var;
	void set(T var) {
		this.var=var;
	}
	T get() {
		return var;
	}
	public static void main(String[] args) {
		ClassGenerics<String> cs=new ClassGenerics<String>();
		cs.set("OnePlus");
		System.out.println(cs.get());
		
		ClassGenerics<Integer> ci =new ClassGenerics<Integer>();
		ci.set(60);
		System.out.println(ci.get());
		
		ClassGenerics<Person> cp=new ClassGenerics<Person>();
		cp.set(new Person("Sarvesh","NYC"));
		System.out.println(cp.get());
	}

}
