/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 2
* QUESTION: 1
*
* PURPOSE: Prints out a narrowing star pattern in a star box.
*/

public class A2Q1{
	public static void main (String[] args){
		for(int i = 0; i < 7; i++){       //creates 7 rows
			for(int j = 0; j < 7; j++){    //creates 7 columns
				if(j == 0 || j > i || i == 6){   //prints pattern
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(); //prints new line
		}
	}
}