package com.tns.collections;

public class VectorExecutor {

	public static void main(String[] args) {
		VectorDemo vd=new VectorDemo();
		vd.insert(20);
		vd.insert(30);
		vd.display();
		for(int i=0;i<10;i+=3) {   //for(i=0;i<10;i=+3)//RTE
			vd.insert(i);
		}
		vd.display();
		vd.returnFirstElement();
		vd.returnLastElement();
		vd.delete(0);
		vd.deleteIndex(2);
		vd.iterate();
		vd.sort();
		vd.duplicate();
	}

}
