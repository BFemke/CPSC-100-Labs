/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 5
* QUESTION: 1
*
* PURPOSE: Creates encryptor object that can encrypt given messages based on difficulty level.
*/

import java.security.SecureRandom;
import java.util.Scanner;

public class Encryptor
{

   	private int difficulty;
   	private String originalStr = "";
  	private String encryptedStr = "";
  	SecureRandom random = new SecureRandom();

   	//constructor creates an object with a set difficulty level
  	public Encryptor(int difficulty)
	{
		this.difficulty = difficulty;
	}

	/**
	* PURPOSE: Returns the set difficulty level of object
	*
	* @return int difficulty - Difficulty level stored in object
	*/
	public int getDiff()
	{
		return difficulty;
	}

	/**
	* PURPOSE: Returns the original message that was given to the object
	*
	* @return String originalStr - The original message stored in object
	*/
	public String getOriginalStr()
	{
		return originalStr;
	}

	/**
	* PURPOSE: Returns the encrypted message stored in object
	*
	* @return String encrypted - The encrypted message stored in object
	*/
	public String getEncryptedStr()
	{
		return encryptedStr;
	}

	/**
	* PURPOSE: It encrypts a given message and returns the encrypted message
	*
	* @param String originalStr - The message that needs to be encrypted
	*
	* @return String encryptedStr - The encrypted message created by the method from the original string
	*/
	public String encryptString(String originalStr)
	{
		this.originalStr = originalStr;
		String characters = "qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM0123456789"; //creates the pool of random characters to draw from

		//Creates the new encrypted message starting backwards
		for(int i = originalStr.length(); i > 0; i--)
		{
			encryptedStr = encryptedStr + originalStr.charAt(i - 1);

			//Inserts random characters equal to the difficulty level between each character of the original message
			for(int j = 0; j < difficulty; j++)
			{
				encryptedStr = encryptedStr + characters.charAt(random.nextInt(62));
			}

		}

		return encryptedStr;
	}

}