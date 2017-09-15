package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		Collection c = new ArrayList();       //父类引用指向子类对象
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        System.out.println(c);
        c.remove("a");
        System.out.println(c);

        System.out.println(c.contains("b"));
        System.out.println(c.isEmpty());
        System.out.println(c.size());
		c.clear();
        System.out.println(c);
        System.out.println(c.contains("b"));
        System.out.println(c.isEmpty());


	}

	private static void demo1() {
		Collection c = new ArrayList();       //父类引用指向子类对象
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);               //自动装箱new Boolean(true)
		boolean b3 = c.add(100);
		boolean b4 = c.add(new Student("张三",23));
		boolean b5 = c.add("abc");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(c);
	}

}
