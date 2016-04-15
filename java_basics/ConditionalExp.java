package com.java_basics;

public class ConditionalExp
{
	/**
	 * Do not change the first two 
	 * lines of this program. They
	 * are used to declare the Main
	 * class and the main method. 
	 */

	public static void main(String[] args)
	{
			int goalsBarc = 2;
			int goalsMad = 1;
			System.out.println("The results was:");
			System.out.println("Barcelona "+goalsBarc +" - Madrid "+goalsMad);
			if(goalsMad > goalsBarc){
			    System.out.println("Real Madrid won!");
			    if((goalsMad-goalsBarc) > 3){
			        System.out.println("What a match from Madrid players!");
		    	}
			}
			
			if(goalsBarc > goalsMad){
			    System.out.println("F.C. Barcelona won!");
			    if((goalsBarc-goalsMad) > 3){
			        System.out.println("What a match from Barcelona players!");
		    	}
			}
			
			if(goalsMad == goalsBarc){
			    System.out.println("They are even!");
			}
			
			if((goalsMad> 3) && (goalsBarc > 3)){
			    System.out.println("Both teams scored more than 3 goals!");
			}
			
		}
	}

