package com.syntax.Tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*Create an array on double values using scanner
		 *  and calculate the sum 
		 *  of all stored elements in that array.
		 */
System.out.println("Please enter how many elements you want to store");
Scanner scan=new Scanner(System.in);
double[] num=null;
double sum=0.0;
int size =scan.nextInt();
num=new double[size];

System.out.println("enter the number one by one");
 
for(int i=0;i<num.length;i++) {
	 num[i]=scan.nextDouble();
	
	sum+=num[i];}
		System.out.println(sum);
	}
}



