public class Encrypter
{
	
	static String encrypt(String input)
	{
		String returnString;
		String temp1;
		String temp2;
		String temp3;
		String temp4;
		
		//Get the value of the string at a given position
		//convert the character to an integer using parseInt
		//Perform encryption arithmetic
		//store that value in a temp that aligns with the position of the character
		temp1 = Integer.toString((Integer.parseInt(String.valueOf(input.charAt(0))) + 7) % 10);
		temp2 = Integer.toString((Integer.parseInt(String.valueOf(input.charAt(1))) + 7) % 10);
		temp3 = Integer.toString((Integer.parseInt(String.valueOf(input.charAt(2))) + 7) % 10);
		temp4 = Integer.toString((Integer.parseInt(String.valueOf(input.charAt(3))) + 7) % 10);
		
		//Concatenate the strings in the new swapped order
		returnString = temp3;
		returnString = returnString + temp4;
		returnString = returnString + temp1;
		returnString = returnString + temp2;
		
		return returnString;
	}
	
}