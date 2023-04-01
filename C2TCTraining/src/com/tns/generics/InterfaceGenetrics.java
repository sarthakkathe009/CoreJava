package com.tns.generics;

interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
}


public class InterfaceGenetrics<T extends Comparable<T>> implements MinMax<T> {
	T[] val;
	public InterfaceGenetrics(T[] obj) {
		val=obj;
	}
	

	@Override
	public T min() {
		T minval=val[0];
		for(int i=0;i<val.length;i++) {
			if(val[i].compareTo(minval)<0) {
				minval=val[i];
			}
		}
		return minval;
	}


	@Override
	public T max() {
		T maxval=val[0];
		for(int i=0;i<val.length;i++) {
			if(val[i].compareTo(maxval)>0) {
				maxval=val[i];
			}
		}
		return maxval;
	}
	
	public static void main(String[] args) {
		Float arr[] = { 3.22f, 6.8f, 222.8f, 88.9f, 6.0f };
		InterfaceGenetrics<Float> obj1 = new InterfaceGenetrics<Float>(arr);

		System.out.println("Minimum value is : " + obj1.min());
		System.out.println("Maximum value is : " + obj1.max());

		String arr1[] = { "Ankit", "Pooja", "Neha", "Sakshi", "Amol" };
		InterfaceGenetrics<String> obj2 = new InterfaceGenetrics<String>(arr1);

		System.out.println("Minimum value is : " + obj2.min());
		System.out.println("Maximum value is : " + obj2.max());
		
		Person p[]=new Person[] {new Person("Nitin", "Pune"), new Person("Manoj", "Mumbai"),new Person("Mayur", "Delhi")};
		InterfaceGenetrics<Person> obj3 = new InterfaceGenetrics<Person>(p);
		System.out.println("Minimum value is : " + obj3.min());
		System.out.println("Maximum value is : " + obj3.max());

	}

}
