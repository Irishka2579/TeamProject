package com.syntax.Tasks;

public class Task2 {

	public static void main(String[] args) {
	/* TODO:Create a 2D array or integer type
	 *  where you will store odd and even numbers.
	 *  Develop a program which will identify/print the even numbers only.
	 */
int [][]numbers= {
		{2,15,17,18},
		{1,7,8,13,20}

                   };

for (int i=0; i<numbers.length;i++) {
	for (int j=0; j<numbers[i].length;j++) {
	int  num=numbers[i][j]; {
		if(num%2==0) {
	
		System.out.print(num+" ");}
	
		}
	}}}}