package com.heima.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo4_listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			//Object object = (//Object) lit.next();
			System.out.println(lit.next());
		}
		System.out.println("----------------");
		while (lit.hasPrevious()) {
			//Object object = (Object) lit.next();
			System.out.println(lit.previous());
			
		}
		

	}

}
