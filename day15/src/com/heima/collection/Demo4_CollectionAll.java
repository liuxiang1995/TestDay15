package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;


@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo4_CollectionAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		c2.add("f");
//		c2.add("z");
//		System.out.println(c1.containsAll(c2));
//		c1.removeAll(c2);
//		System.out.println(c1);
		//取交集，如果调用的集合改变，就true，如果调用的集合没变，就返回false
		boolean b = c1.retainAll(c2);            //取交集
		System.out.println(b);
		System.out.println(c1);


	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);
		System.out.println(c1);
	}

}
