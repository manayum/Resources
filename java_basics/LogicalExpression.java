package com.java_basics;

public class LogicalExpression
{
	
	public static void main(String[] args)
	{
		   
		double[] myList = {1.9,2.9,3.4,3.5};
		double max = myList[0];
		System.out.println("now "+ max);
		for(int i=0; i<myList.length;i++)
		{
		
			if(myList[i]>max)
				max = myList[i];
			System.out.println(max);
		}
		System.out.println("max is :" + max);
		
		    boolean a = true;
		    boolean b = false;
		    boolean c= !false;
		    
		    boolean d = b && !c;
		    boolean e = (c || d) || false;
		    boolean f = !(b && c) && (true || (c && a));
		    boolean g = (a && b) || c && d || (e || f);
		    
		    System.out.println("a = "+ a);
			System.out.println("b = "+ b);
			System.out.println("c = "+ c);
			System.out.println("d = "+ d);
			System.out.println("e = "+ e);
			System.out.println("f = "+ f);
			System.out.println("g = "+ g);
		}
	}

