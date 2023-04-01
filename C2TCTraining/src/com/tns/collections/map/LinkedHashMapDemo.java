package com.tns.collections.map;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//ordered, unsorted map - allows null key and null values
				LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<String, Integer>();
				lhmap.put("Nitin", 56000);
				lhmap.put("Pankaj", 76000);
				lhmap.put("Dhruv", 88200);
				lhmap.put("Ankit", 45000);
				lhmap.put("Shashwat", 76000);
				System.out.println("Employee Details "+lhmap);
				lhmap.put("Shashwat", 80000); //allows unique key, so value replaced by 80000
				System.out.println("Employee Details after adding new employee "+lhmap);
				
				lhmap.put("Manoj",null);
				System.out.println("Employee Details "+lhmap);
				
				lhmap.put(null,null);
				System.out.println("Employee Details "+lhmap);
				
				System.out.println("---Traversing---");
				Set set=lhmap.entrySet();
				Iterator i=set.iterator();
				while(i.hasNext()) {
					Map.Entry me=(Map.Entry)i.next();
					System.out.println(me.getKey()+" = "+me.getValue());
				}
				

	}

}
