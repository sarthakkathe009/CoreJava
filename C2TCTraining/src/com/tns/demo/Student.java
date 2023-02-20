package com.tns.demo;
//final public class Student - final classes can't be inherited
public class Student {
	private int id;
	protected String name;
	float per;
	public Student() {
		System.out.println("DEFAULT CONSTRUCTOR");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
		System.out.println("PARAMETERIZED CONSTRUCTOR");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	

}
