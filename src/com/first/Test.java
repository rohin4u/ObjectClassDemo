package com.first;

import java.lang.reflect.Method;

import com.spiderscrawl.Test1;
import com.spiderscrawl.Test2;

public class Test {

	public static void main(String[] args) {
		
		int count = 0;
		
		Object o = new String();
		
		Class c = o.getClass();
		System.out.println("Fully qualified name of class "+c.getName());
		
		Method m[] = c.getDeclaredMethods();
		
		for(Method m1 : m) {
			count++;
			System.out.println(m1);
		}
		System.out.println(count);

	}

}
