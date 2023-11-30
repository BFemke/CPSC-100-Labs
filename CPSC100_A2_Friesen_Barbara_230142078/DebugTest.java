/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 2
* QUESTION: 3
*
* PURPOSE: Calculates area and circumference when given a radius.
*/

import javax.swing.JOptionPane;

public class DebugTest{
	public static void main(String[] args){
		double PI = 3.14;
		String radiusString = "";
		double radiusDouble = 0.0;
		double area = 0.0;
		double circumference = 0.0;

        radiusString = JOptionPane.showInputDialog("Enter the radius of a circle to calculate the area: ");
        radiusDouble = Double.parseDouble(radiusString);

        area = calculateArea(radiusDouble);  //Wrong variable was used, changed radius to radiusDouble
        circumference = calculateCircumference(area);

        outputResult(area, circumference);  //Had to add parameters to send to outputResult method

        System.out.println("End of Processing...");
	}
	/**
	* PURPOSE: Calculates area given a radius.
	*
	* @param   double radius - recieved through input scanner.
	*
	* @return  double result - Calculated area is sent back.
	*/
    public static double calculateArea(double radius){   //Had to change return type to double and change method to static
    	double PI = 3.14;
		double result = Math.pow(radius, 2) * PI;
		return result;     //Had to return result to main method
	}
	/**
	* PURPOSE: Calculates circumference using area.
	*
	* @param   double area - Which was calculated in calculateArea method.
	*
	* @return  double result - Calculated circumference is sent back.
	*/
	public static double calculateCircumference(double area){ //Had to change return type to double and change method to static
		double PI = 3.14;
		double result = Math.sqrt(area / PI) * PI * 2;
		return result;  //Had to return result to main method
	}
	/**
	* PURPOSE: Prints out area and circumference.
	*
	* @param   double area -  Which was calculated in calculateArea method.
	* @param   double circumference - Which was calculated in calculateCircumference method.
	*
	* @return  VOID
	*/
	public static void outputResult(double area, double circumference){  //had to add parameters to recieve
		JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);
		JOptionPane.showMessageDialog(null, "The circumference of the circle is: " + circumference);
	}
}