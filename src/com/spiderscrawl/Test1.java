package com.spiderscrawl;

public class Test1 implements OuterInterface{
	
	
	public void m1() {
		
		System.out.println("inside outerinterface method");
		
	}

	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		test1.m1();
		
		Test2 test2 = new Test2();
		test2.m2();

	}

	

}
