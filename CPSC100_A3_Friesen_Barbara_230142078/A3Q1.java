/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 3
* QUESTION: 1
*
* PURPOSE: Determines if user input is a perfect square.
*/

import java.util.Scanner;

public class A3Q1{
	public static void main (String[] args){
		Scanner inputReader = new Scanner(System.in);
		int input = 0;

		System.out.println("Hello this program tests perfect squares!");
		System.out.println("You may enter -1 when you wish to quit the program.");

		System.out.print("Please enter a number: ");
		input = inputReader.nextInt();   //Takes user input to test

		while(input != -1){  //Loops until exit code (-1) is entered

			if(input > 0){  //Checks if user input is valid.
				boolean square = isPerfectSquare(input);  //Calls method to test if input is a perfect square

				if(square == true){
					System.out.println(input + " is a perfect square.");
				}

				else{
					System.out.println(input + " is not a perfect square");
				}

			}

			else{    //Executes if user input is invalid
				System.out.println(input + " is not a valid number...");
			}

			System.out.print("Please enter a number: ");
			input = inputReader.nextInt();   //Accepts new user input
		}
		System.out.println("Goodbye");

	}
	/**
	* PURPOSE: Determines if input is a perfect square.
	*
	* @param   int input - Number given by user to be tested.
	*
	* @return  boolean square - Indicates if the input was a perfect square or not.
	*/
	public static boolean isPerfectSquare(int input){
		boolean square;

		if(input % (Math.sqrt(input)) == 0){ //Determines if input is a perfect square
			return square = true;
		}

		else{    //execute if input is not a perfect square
			return square = false;
		}
	}
}