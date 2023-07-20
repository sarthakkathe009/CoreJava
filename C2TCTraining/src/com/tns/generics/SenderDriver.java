package com.tns.generics;

public class SenderDriver {

	public static void main(String[] args) {
		
		Sender<String> ss=new Sender<String>();
		ss.setMessage("Hey there I am using WhatsApp!");
		
//		Sender<Person>[] arrsp=new Sender[3];
//		arrsp[0]=new Sender<Person>();
//		arrsp[0].setMessage(new Person("Carla","Spain"));
//		arrsp[1].setMessage(new Person("Sam","Australia"));
//		arrsp[2].setMessage(new Person("John","UK"));
//		
//		for(int i=0;i<arrsp.length;i++) {
//				System.out.print(arrsp[i]);
//			
//		}
		
     	Sender<Person> sp=new Sender<Person>();
		sp.setMessage(new Person("Carla","Spain"));
		
		ss.sendMessage();
		sp.sendMessage();
			
	}

}
