package com.syntax.Tasks;

public class Task5 {

	public static void main(String[] args) {
		// TODO Create an array of countries. 
		//While retrieving all values from an array print capital for each country.
		//(use 2 different loops).
    String [][]CC= {
    		
		{"Italy","Russia","France"},
			{"Rome","Moscow","Paris"},	
   
                   };
    
	 for(int i=0; i<CC.length;i++) {
		 for(int j=0; j<CC[i].length; j++) {

		 System.out.println(CC[i][j]+" - "+CC[i+1][j]);
	 }
		 }}
	
	}


