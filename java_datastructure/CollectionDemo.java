package com.java_datastructure;

import java.util.*;

public class CollectionDemo 
{
	public static void main(String [] args)
	{
		List<String> a1 = new ArrayList<String>();
		a1.add("QTP");
		a1.add("SELENIUM");
		a1.add("DBA");
		System.out.println("ArrayList Elements");
		System.out.println("\t" + a1);
		
		
		List<String> l1 =  new LinkedList<String>();
		l1.add("JAVA");
		l1.add("C++");
		l1.add("OpenGL");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.println("\t" + l1);
		
		
		Set<String> s1 = new HashSet<String>();
		s1.add("SOUP");
		s1.add("ZIRA");
		s1.add("BUG");
		System.out.println();
		System.out.println("Set Elements");
		System.out.println("\t" + s1);
		
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Nayum",38);
		m1.put("Erfan",45);
		m1.put("Mahbub",50);
		System.out.println();
		System.out.println(" Map Elements");
		System.out.println("\t" +m1);
		
		
	}

}
