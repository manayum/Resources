package com.java_basics;

import java.util.Scanner;

public class LowerToUpperCaseConvertion_SCR_01 
{
	public static void main(String[] args) 
	{
	  Scanner mySC = new Scanner(System.in);
	  System.out.println("Please, enter your greetings:");
	  String mySt = mySC.nextLine();
	  mySC.close();
	  System.out.println(mySt.toUpperCase());
	  
	}
}
