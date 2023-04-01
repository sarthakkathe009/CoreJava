package com.tns.generics;

public class MethodGenerics {
	public <E> void display(E[] arr){
		
		for(E arr1:arr) {
			System.out.print(arr1+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("ElementsArray : Genetrics");
		MethodGenerics mg=new MethodGenerics();
		Integer[] iarr= {10,20,30,40};
		String[] sarr= {"Google","GoogleCloud","Microsoft","Azure"};
		System.out.println("---Integer Array---");
		mg.display(iarr);
		System.out.println("---String Array---");
		mg.display(sarr);
	}

}
