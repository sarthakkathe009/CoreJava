package com.tns.lamdaExp;

@FunctionalInterface
interface Message{
	public void greet(String msg);
}

public class WithoutLambaExp {
	public static void main(String[] args) {
		Message m=new Message() {
			public void greet(String name) {
				System.out.println("Hello "+name);
			}
		};
		
		m.greet("Sarthak");
		
		Message msg=(name)->{System.out.println("How are you "+name);};
		msg.greet("Sarvesh");
		
	}
}
