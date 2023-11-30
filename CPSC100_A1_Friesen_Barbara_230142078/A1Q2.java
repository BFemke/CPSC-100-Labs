/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 1
* QUESTION: 2
*
* PURPOSE: To calculate area and circumference using a given radius.
*/

import javax.swing.JOptionPane;

public class A1Q2
{
	public static void main(String[] args)
	{
		double PI = 3.14;   //needs to be double because its a real number not an integer and PIE needed to be PI
		String radiusStr = ""; //Changed to radiusStr because there can't be variables with the same names
		double radius = 0.0;
		double area = 0.0;
		double circumference = 0.0; //float needed to be a double

		radiusStr = JOptionPane.showInputDialog("Enter the radius of a circle to calculate the area: "); //Changed variable name to match previous change
		radius = Double.parseDouble(radiusStr);  //Had to change String name from radius to radiusStr

 		area = Math.pow(radius, 2) * PI;  //the values needed to be switched the radius was in the exponent spot
 		JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);

 		circumference = Math.sqrt(area / PI) * PI * 2;
 		JOptionPane.showMessageDialog(null, "The circumference of the circle is: " + circumference); //message and dialog needs to be capitalized

 		System.out.println("End of Processing...");
 	}
 }