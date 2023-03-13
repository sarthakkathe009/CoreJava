package com.tns.arrayclass;


public class Operations {
	public static void printArrays(int arr[]) {
		System.out.print('['+" ");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.print(']');
		System.out.println();
	}
	 public static int sum(int... n) {
		 int sum=0;
		 for(int no:n) {
			 sum+=no;
		 }
		 return sum;
	 }
	 public static int getOddCount(int b[]) {
		 int count=0;
		 for(int i=0;i<b.length;i++) {
			 if(b[i]%2!=0)
				 count++;
		 }
		 return count;
	 }
	 public static int getEvenCount(int b[]) {
		 return b.length-getOddCount(b);
	 }
}
