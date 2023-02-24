package com.tns.interfacedemo;
import java.util.Scanner;
public class AccDemo {

	public static void main(String[] args) {
		Account a1=new Account(9545,"Sarthak Kathe",900000);
		System.out.println(a1);
		
		Scanner sc = new Scanner(System.in);
		int amount;
		System.out.print("Enter Amount to Deposite : ");
		amount=sc.nextInt();
		a1.deposit(amount);
		System.out.println(a1);
		
		System.out.print("Enter Amount to Withdraw : ");
		amount=sc.nextInt();
		a1.withdraw(amount);
		System.out.println(a1);
		
	}

}
