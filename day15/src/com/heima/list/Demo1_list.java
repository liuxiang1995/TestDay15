package com.heima.list;

import java.awt.List;
import java.util.ArrayList;

public class Demo1_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1, "e");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.set(2, "x");
		System.out.println(list);

	}

}
