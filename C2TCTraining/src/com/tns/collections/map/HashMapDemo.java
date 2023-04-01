package com.tns.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		//Does not follow Insertion Order
		hm.put("Machine Learning",101);
		hm.put("Deep Learning",109);
		hm.put("Business Intelligence",103);
		hm.put("DSBDA",102);
		hm.put("Natural Language Processing",107);
		System.out.println(hm);
		System.out.println("Traversing in Map");
		Set set=hm.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			Map.Entry me=(Map.Entry)i.next();//Map and Entry are interfaces
			System.out.println(me.getKey()+" = "+me.getValue());
		}
		//Hash map with null keys and null values
		HashMap<String, String> hm1=new HashMap<String,String>();
		hm1.put("Sarvesh","sarvesh007@gmail.com");
		hm1.put("Rohit",null);
		hm1.put(null,"abc");
		hm1.put("Harsh",null);
		hm1.put(null,null);//HashMap takes null values
		hm1.put("Ravi","ravi123@gmail.com");
		System.out.println("---Hashmap with Name and EmailId---");
		System.out.println(hm1);
		
	}

}
