package com.tns.collections.map;
import java.util.concurrent.*;
public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> ch =new ConcurrentHashMap<>();
		ch.put(95,"America");
		ch.put(45,"Russia");
		ch.put(102,"India");
		ch.put(78,"HongKong");
		//It do not follow insertion order
		System.out.println(ch);
		ch.putIfAbsent(98,"Australia");//if element already exist list will not update 
		System.out.println(ch);
		//It is concate at first position
		ch.computeIfAbsent(49,k->"India"+"Pakistan");
		System.out.println(ch);
		ch.remove(49,"IndiaPakistan");
		System.out.println(ch);
		ch.replace(78,"Los Angles");
		//ch.put(null,null); //Can't put null Values, throws NullPointer Exception//RTE
		System.out.println(ch);
	}

}
