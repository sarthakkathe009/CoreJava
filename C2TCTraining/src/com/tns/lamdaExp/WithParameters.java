package com.tns.lamdaExp;

public class WithParameters {

	public static void main(String[] args) {
		
		Cube c=(a)->{return a*a*a;};
		System.out.println("Cube of 9: "+c.cal(9));
		
		IsOdd o=(a)->a%2!=0 ? true : false;
		
		System.out.println("Is 8 is odd: "+o.checkOdd(8));
		System.out.println("Is 9 is odd: "+o.checkOdd(9));
	}

}
