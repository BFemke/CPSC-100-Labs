/**
* CPSC 100
* INSTRUCTOR: Terry Jiang
* NAME: Barbara Friesen
* STUDENT NUMBER: 230142078
* ASSIGNMENT: 5
* QUESTION: 1
*
* PURPOSE: Creates decryptor object that can decrypt given messages based on difficulty level.
*/

public class Decryptor
{

    int difficulty;
    String encryptedStr = "";
    String decryptedStr = "";

	//Creates a decryptor object with a set difficulty level
   	public Decryptor(int difficulty)
	{
		this.difficulty = difficulty;
	}

	/**
	* PURPOSE: Returns difficulty level stored in object
	*
	* @return int difficulty - The set difficulty level
	*/
	public int getDiff()
	{
		return difficulty;
	}

	/**
	* PURPOSE: Returns the encrypted string stored in object
	*
	* @return String encryptedStr - The encrypted String given to object
	*/
	public String getEncryptedStr()
	{
		return encryptedStr;
	}

	/**
	* PURPOSE: Returns the decrypted string stored in object
	*
	* @return String decryptedStr - The decrypted string created by the object
	*/
    	public String getDecryptedStr()
	{
		return decryptedStr;
	}

	/**
	* PURPOSE: To decrypt given string and return decrypted string
	*
	* @param String encryptedStr - The string given that needs to be decrypted
	*
	* @return String decryptedStr - The decrypted string caluculated by method
	*/
	public String decryptString(String encryptedStr)
	{
		this.encryptedStr = encryptedStr;

		//Creates decrypted message using i as an index and another loop to skip over the random characters
		for(int i = 0; i < encryptedStr.length(); i++)
		{
			decryptedStr = encryptedStr.charAt(i) + decryptedStr;

			//Increments i by the difficulty level to skip over the random characters
			for(int j = 0; j < difficulty; j++)
			{
				i++;
			}

		}

		return decryptedStr;
	}

}