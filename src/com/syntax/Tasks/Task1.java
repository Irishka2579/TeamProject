package com.syntax.Tasks;

public class Task1 {

	public static void main(String[] args) {
		/* TODO:Create a 2D array of integer values.
		*Print the sum of all numbers.
        */
		int[][]numbers= {
				
				{10,20,30,40},
				{50,60,70},
				
			       };
		int sum=0;
		   
		for(int i=0; i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length; j++) {
				sum+=numbers[i][j];}
			System.out.println();}
				System.out.print("The sum of all numbers is "+sum);
		
	
		
}
}