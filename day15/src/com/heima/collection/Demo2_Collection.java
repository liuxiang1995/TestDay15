package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		Collection c = new ArrayList();       //��������ָ���������
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
		Collection c = new ArrayList();       //��������ָ���������
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);               //�Զ�װ��new Boolean(true)
		boolean b3 = c.add(100);
		boolean b4 = c.add(new Student("����",23));
		boolean b5 = c.add("abc");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(c);
	}

}
