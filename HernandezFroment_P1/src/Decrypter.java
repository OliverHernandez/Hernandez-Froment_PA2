public class Decrypter
{
	
	static String decrypt(String input)
	{
		String returnString;
		int temp1;
		int temp2;
		int temp3;
		int temp4;
		String string1;
		String string2;
		String string3;
		String string4;
		
		//Same process as capturing user input from encryption
		temp1 = Integer.parseInt(String.valueOf(input.charAt(0)));
		if (temp1 >= 7)
		{
			temp1 -= 7;
		}
		else
		{
			temp1 += 3;
		}
		
		temp2 = Integer.parseInt(String.valueOf(input.charAt(1)));
		if (temp2 >= 7)
		{
			temp2 -= 7;
		}
		else
		{
			temp2 += 3;
		}
		
		temp3 = Integer.parseInt(String.valueOf(input.charAt(2)));
		if (temp3 >= 7)
		{
			temp3 -= 7;
		}
		else
		{
			temp3 += 3;
		}
		
		temp4 = Integer.parseInt(String.valueOf(input.charAt(3)));
		if (temp4 >= 7)
		{
			temp4 -= 7;
		}
		else
		{
			temp4 += 3;
		}
		
		//Create strings from the integers
		string1 = Integer.toString(temp1);
		string2 = Integer.toString(temp2);
		string3 = Integer.toString(temp3);
		string4 = Integer.toString(temp4);
		
		//Concatenate the strings in the original order
		returnString = string3;
		returnString = returnString + string4;
		returnString = returnString + string1;
		returnString = returnString + string2;
		
		return returnString;
	}
	
	
}