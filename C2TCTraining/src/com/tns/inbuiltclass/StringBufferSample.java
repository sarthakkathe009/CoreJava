package com.tns.inbuiltclass;

public class StringBufferSample {

	public static void main(String[] args) {
		StringBuffer buf=new StringBuffer("Concatination!!");
		System.out.println("StringBuffer Obj: "+buf);
		System.out.println("Length: "+buf.length());
		System.out.println("Capacity: "+buf.capacity());
		//By default, an empty string buffer contains 16 character capacity.
		String s;
		int z=99;
		buf=new StringBuffer(40);
		s=buf.append("z-> ").append(z).append("+").append("98").append(" = 197").toString();
		System.out.println(s);
		
		buf=new StringBuffer("I JAVA!");
		buf.insert(2,"Like  ");
		System.out.println(buf);
		
		buf.delete(7,8);
		System.out.println(buf);
		
		System.out.println(buf.reverse());
	}

}
