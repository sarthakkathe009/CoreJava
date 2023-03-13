package com.tns.arrayclass;

//import java.util.Arrays;

public class ArrayOfObject {

	public static void main(String[] args) {
		// declares an Array of integers.
		Student[] sar;
		// allocating memory for 3 objects of type Student.
		sar=new Student[3];
		// initializing Array
		sar[0]=new Student("Sarthak",11);
		sar[1]=new Student("Sonali",30);
		sar[2]=new Student("Rohit",24);
		
		for(int i=0;i<sar.length;i++) {
			System.out.println("RollNo: "+sar[i].getRollNo());
			System.out.println("Name: "+sar[i].getName());
		
		}
		//System.out.println(Arrays.toString(sar));
		
	}

}
