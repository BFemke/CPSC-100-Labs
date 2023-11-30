/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 2
* QUESTION: 2
*
* PURPOSE: Give calculated numbers of fibonacci numbers requested through input.
*/

import java.util.Scanner;

public class A2Q2{
	public static void main (String[] args){

		int num1 = 1;
		int num2 = 1;
		String fibonacciNumStr = " ";
		int fibonacciNum = 0;

		Scanner inputReader = new Scanner(System.in);
		System.out.println("How many Fibonacci numbers do you want to display?");
		fibonacciNumStr = inputReader.nextLine();       //Section gets the number of fibonacci numbers wanted
		fibonacciNum = Integer.parseInt(fibonacciNumStr);

		if(fibonacciNum >= 1){
			System.out.print(num1 + " ");  //Prints out first fibonacci number
		}

		if(fibonacciNum >= 2){
			System.out.print(num2 + " ");  //Prints out second fibonacci number
		}

		for(int i = 2; i < fibonacciNum; i++){
			int num3 = num1 + num2;
			num1 = num2;               //calculates and prints out fibonacci numbers requested starting from third
			num2 = num3;
			System.out.print(num3 + " ");
		}

		System.out.println();     //Prints new line
		System.out.println("Goodbye");

	}
}