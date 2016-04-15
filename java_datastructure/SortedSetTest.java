package com.java_datastructure;

import java.util.*;

public class SortedSetTest
{
	public static void main(String[]args)
	{
		// Create the sorted set
		SortedSet<String> set = new TreeSet<String>();
	
		//Add elements to the set 
		set.add("b");
		set.add("a");
		set.add("c");
		
		// Iterating over the elements in the set

		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}
