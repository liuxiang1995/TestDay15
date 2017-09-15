package com.heima.list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class Demo3_list {

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
		ListIterator it = list.listIterator();
		while (it.hasNext()) {
			String str = (String)it.next();
			if ("world".equals(str)) {
				it.add("javaee");                 //遍历的同时在添加，这叫并发修改
			}
			
		}
		System.out.println(list);

	}

}
