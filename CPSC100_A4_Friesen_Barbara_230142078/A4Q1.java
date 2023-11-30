/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 4
* QUESTION: 1
*
* PURPOSE: Print pattern whose size and layout is determined through user input.
*/
import java.util.Scanner;

public class A4Q1{
	public static void main(String[] args){

		Scanner inputReader = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int sideLength = 0;
		String[] pattern;

		System.out.println("Welcome to 2D Board v1.0! (press -1 to exit)\n");

		while(sideLength < 1 && sideLength != -1){
			System.out.print("Please enter a side length for the board: ");
			sideLength = inputReader.nextInt();         //Gets side length through user input
			if(sideLength < 1 && sideLength != -1){     //Checks if input is valid
				System.out.println(sideLength + " is an invalid side length. Side length must be a positive number.");
			}

			else if(sideLength == -1){    //exit program at input side length
				System.out.println("Okay, goodbye.");
				return;
			}

		}

		System.out.println("Board with side length of " + sideLength + " has been created.");

		int patternSize = (sideLength * sideLength);    //calculates length array needs to be

		pattern = new String[patternSize];    //creates appropriatly sized array

		for(int i = 0; i < (pattern.length); i++){  //Assigns "O" to every element of the array
			pattern[i] = "O";
		}

		while(sideLength != -1){   //Loops until exit sequence is entered
			x = 0;
			y = 0;

			while(x > sideLength || x < -1 || x == 0){
				System.out.print("Please enter the x-coordinate: ");   //Gets x-coordinate
				x = inputReader. nextInt();

				if(x < -1 || x > sideLength || x == 0){    //checks if x-corrdinate is valid
					System.out.println(x + " is not a valid coordinate.");
				}
				if(x == -1){
					System.out.println("Okay, goodbye.");
					return;
				}

			}

			while(y > sideLength || y < 1){
				System.out.print("Please enter the y-coordinate: ");   //Gets y-coordinate
				y = inputReader. nextInt();

				if(y < -1 || y > sideLength || y == 0){   //checks if y-coordinate is vaild
					System.out.println(y + " is not a valid coordinate.");
				}
				if(y == -1){
					System.out.println("Okay, goodbye.");
					return;
				}
			}

			int index = convertIndex(x, y, sideLength);  //Gets array index number associated with given coordinates

			if(pattern[index] == "X"){   //checks if coordinates have already been used
				System.out.println("You have already used those coordinates.");
			}

			else{
				pattern[index] = "X";
				for(int i = 0; i < (pattern.length); i++){  //This loop prints updated pattern
					System.out.print(pattern[i]);
					if((i + 1) % sideLength == 0){
						System.out.println();
					}
				}
			}

			System.out.println();
		}

	}
	/**
			* PURPOSE: Calculates index number of given coordinates in created array.
			*
			* @param   int x - The x-coordinate given by the user.
			*		   int y - The y-coordinate given by the user.
			*		   int sideLength - The side length of the created pattern.
			*
			* @return  int index = The index number associated with the given coordinates in the created pattern.
	*/

	public static int convertIndex(int x, int y, int sideLength){
		int index = ((y - 1) * sideLength) + (x - 1);  //Calculates index value
		return index;

	}
}