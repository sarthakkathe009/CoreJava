package com.tns.lamdaExp;

public class WithoutParameters {

	public static void main(String[] args) {
		Statement s=()->{return "Hello Programmer!!";};
		System.out.println(s.show());
	}

}
