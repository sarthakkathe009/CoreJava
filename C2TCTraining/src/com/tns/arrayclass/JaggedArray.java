//Jagged Array
package com.tns.arrayclass;

class JaggedArr {
	static void printArray(int d[][]) {
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++)
				System.out.print(d[i][j] + " ");
			System.out.println();
		}

	}
}

public class JaggedArray {

	public static void main(String[] args) {

		int d[][] = { { 10, 20, 30 }, { 40 }, { 12, 21 }, { 11 } };

		System.out.println("Total Rows in Array d : " + d.length);

		JaggedArr.printArray(d);
	}

}
