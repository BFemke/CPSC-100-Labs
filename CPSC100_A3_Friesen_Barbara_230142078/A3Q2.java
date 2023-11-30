/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 3
* QUESTION: 2
*
* PURPOSE: Determines if user input is a Fibonacci number.
*/

import java.util.Scanner;

public class A3Q2{
	public static void main (String[] args){
		Scanner inputReader = new Scanner(System.in);

		System.out.println("This program will check if a number is part of the Fibonacci sequence!");
		System.out.println("You may enter -1 when you want to quit the program.");

		System.out.print("Please enter a number: ");
		int input = inputReader.nextInt();       //Takes user input to test

		while(input != -1){    //Loops until exit code (-1) is entered.
			if(input > 0){     //Checks if user input is valid

				boolean fibNumber = isFibNumber(input);  //Calls method to check if input is a Fibonacci number
				if(fibNumber == true){
					System.out.println(input + " is a Fibonacci number.");
				}

				else{
					System.out.println(input + " is not a Fibonacci number.");
				}

			}
			else{           //Executes if user input is invalid
				System.out.println(input + " is not a valid number...");
			}

			System.out.print("Please enter a number: ");
			input = inputReader.nextInt();       //Accepts new user input
		}

		System.out.println("Goodbye.");

	}
	/**
		* PURPOSE: Determines if input is a Fibonacci number.
		*
		* @param   int input - Number given by user to be tested.
		*
		* @return  boolean fibNumber - Indicates if the input was a Fibonacci number or not.
	*/
	public static boolean isFibNumber(int input){
		boolean fibNumber;

		double check1 = (5 * (Math.pow (input, 2)) + 4); //calculates first conditional check
		double check2 = (5 * (Math.pow (input, 2)) - 4);  //calculates second conditional check

		if((check1 % (Math.sqrt(check1)) == 0) || (check2 % (Math.sqrt(check2)) == 0)){  //Tests if either checks are perfect squares which would indicate the input is a Fibonacci number
			return fibNumber = true;
		}

		else{     //Executes if input is not a Fibonacci number
			return fibNumber = false;
		}
	}
}