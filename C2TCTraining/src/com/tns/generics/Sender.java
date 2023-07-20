package com.tns.generics;


public class Sender<T> {
	T msg;

	public Sender() {
		
	}
	
	public Sender(T msg) {
		this.msg=msg;
	}
	
	public void setMessage(T msg) {
		this.msg=msg;
	}
	
	public void sendMessage() {
		System.out.println(msg);
	}	
}
