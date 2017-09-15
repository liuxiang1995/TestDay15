package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo3_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo2();
		Collection c = new ArrayList();
		c.add(new Student("����",23));
		c.add(new Student("����",24));
		c.add(new Student("����",25));
		c.add(new Student("����",26));
		System.out.println(c);
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			Student s = (Student)arr[i];
			System.out.println(s.getName()+"..."+s.getAge());
		}
		

	}

	@SuppressWarnings("unused")
	private static void demo2() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		Object[] arr = c.toArray();        //������ת��������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
