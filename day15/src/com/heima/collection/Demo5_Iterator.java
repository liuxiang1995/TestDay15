package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.heima.bean.Student;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo5_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("张三",24));
		c.add(new Student("张三",25));

		
		Iterator it = c.iterator();  
		while (it.hasNext()) {
//			System.out.println(it.next());
			Student s = (Student)it.next();
			System.out.println(s.getName()+"..."+s.getAge());
			
		}

	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Iterator it = c.iterator();             //获取迭代器
		
//		boolean b1 = it.hasNext();
//		Object obj1 = it.next();
//		System.out.println(b1);
//		System.out.println(obj1);
//		
//		boolean b2 = it.hasNext();
//		Object obj2 = it.next();
//		System.out.println(b2);
//		System.out.println(obj2);
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
