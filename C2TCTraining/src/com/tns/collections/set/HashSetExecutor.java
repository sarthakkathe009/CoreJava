package com.tns.collections.set;

import java.util.HashSet;

public class HashSetExecutor {

	public static void main(String[] args) {
		HashSetDemo hsd=new HashSetDemo();
		HashSet<Integer> hs=new HashSet<Integer>();
		HashSet<Integer> hs1=new HashSet<Integer>();
		hsd.addElement1(hs);
		hsd.addElement2(hs1);
		hsd.display(hs);
		hsd.display(hs1);
		hsd.equal(hs,hs1);
		System.out.println("--Split of Set2--");
		hsd.splitSet(hs1);
		hsd.union(hs,hs1);
		
		HashSet<Integer> d=new HashSet<Integer>();
		hsd.addElement1(d);
		hsd.setDiff(d,hs1);
		System.out.println("---Traversing---");
		hsd.iterate(d);
		
	}

}
