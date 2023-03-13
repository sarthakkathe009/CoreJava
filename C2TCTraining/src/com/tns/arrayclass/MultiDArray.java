package com.tns.arrayclass;

class MulArray{
	public static void printArr(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}


public class MultiDArray {

	public static void main(String[] args) {
		int arr1[][]= {{12,14},{55,66},{69,96}}; //[1]-->Row [2]-->Column
		System.out.println("No. of Rows : "+arr1.length);
		MulArray.printArr(arr1);

	}

}
