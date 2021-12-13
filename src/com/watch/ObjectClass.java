package com.watch;

public class ObjectClass {
	
	int i =10;
	String s = "Delhi";
	
	public String toString() {
		
		return i+", "+s;
	}
	public int hashCode()
	{
		return i;
	}
	

	public static void main(String[] args)throws Exception {
		
		ObjectClass oc = new ObjectClass();
		System.out.println(oc);
		System.out.println(oc.hashCode());
		
		ObjectClass oc1 = oc;
		
		Object o = new Object();
		
		Object o1 = o;
		System.out.println(o1);
		System.out.println(o);
		
		if(oc.equals(oc1)) 
		{
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}
		
		if(o.equals(o1)) {
			System.out.println(true);
		}else
		{
			System.out.println(false);
		}
		
	}

}
