/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 1
* QUESTION: 3
*
* PURPOSE: To calculate Microsoft's networking and video patent payment to Motorola
*/

import java.util.Scanner;

public class A1Q3{
	public static void main(String[] args){

		Scanner inputReader = new Scanner(System.in);

		System.out.println("Enter the number of Xbox 360s (in millions) sold to date:");
		String xboxSoldStr = inputReader.nextLine();
		double xboxSold = Double.parseDouble(xboxSoldStr);

		System.out.println("Enter the price per Xbox 360 (in cents) to be used for the video patent license: ");
		String videoPriceCentsStr = inputReader.nextLine();
		double videoPriceCents = Double.parseDouble(videoPriceCentsStr); //This section takes in video patent price in cents and converts it to dollars.
		double videoPriceDollars = videoPriceCents / 100;

		double totalVideoPrice = videoPriceDollars * xboxSold; //Calculates total for video patent

		System.out.println("Microsoft would have to pay Motorola $" + videoPriceDollars
			+ " per Xbox 360 for the video patent license. \nWith " + xboxSold + " million Xbox 360s this comes to a total of "
			+ totalVideoPrice + " million dollars.");

		System.out.println("Enter the price per Xbox 360 (in cents) to be used for the networking patent license:");
		String networkPriceCentsStr = inputReader.nextLine();              //This section takes in network patent price in cents and converts is to dollars
		double networkPriceCents = Double.parseDouble(networkPriceCentsStr);
		double networkPriceDollars = networkPriceCents / 100;

		double totalNetworkPrice = xboxSold * networkPriceDollars;  //Calculates total for network patent

		System.out.println("Microsoft would have to pay Motorola $" + networkPriceDollars
			+ " per Xbox 360 for the networking patent license. \nWith " + xboxSold + " million Xbox 360s this comes to a total of "
			+ totalNetworkPrice + " million dollars.");

		double totalPatentPrice = totalVideoPrice + totalNetworkPrice; //Calculates total price for both patents
		System.out.println("For this case the total amount for both patent licenses is " + totalPatentPrice + " million dollars.");

		System.out.println("Goodbye.");


	}
}
