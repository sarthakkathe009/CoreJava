package com.tns.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		try {
			System.out.println("Enter numbers: ");
			n1=sc.nextInt();
			n2=Integer.parseInt(args[0]);
			System.out.println("Division: "+n1/n2);
			sc.close();
		}
		/*
		 * catch(ArithmeticException | InputMismatchException | NumberFormatException i)
		 * { System.err.println("Error!!! "+i.getMessage()); }
		 */
		catch(ArithmeticException a) {
			System.err.println("Error(Arthimetic) "+a.getMessage());
		}
		catch(InputMismatchException i) {
			System.err.println("Error(InputMisMatch) "+i.getMessage());
		}
		catch(NumberFormatException n) {
			System.err.println("Error(NumberFormat) "+n.getMessage());
		}
		/*
		 * catch(Exception e) { System.err.println(e.getMessage()); }
		 */
	}
}
