package com.java_datastructure;

import java.util.*;

public class HashTableDemo
{
	public static void main(String [] args)
	{
		// Create a Hash Map
		Hashtable<String, Double> balance = new Hashtable<String, Double>();
		Enumeration<String> names;
		
		String str;
		double bal;
		
		balance.put("Zara", new Double(100.00));
		balance.put("Nayum", new Double(200.0));
		balance.put("Erfan", new Double(500.0));
		balance.put("Qadir", new Double(600.0));
		
		// Show all balance in hash table
		names = balance.keys();
		while(names.hasMoreElements())
		{
			str = (String)names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();
		bal = ((Double)balance.get("Nayum")).doubleValue();
		balance.put("Nayum",new Double(bal+1000));
		System.out.println("Nayum's new balance: " + balance.get("Nayum"));
				
	}
}
