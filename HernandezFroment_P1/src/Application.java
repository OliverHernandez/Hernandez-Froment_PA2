import java.util.Scanner;
//Scanner syntax borrowed from 
//https://www.w3schools.com/java/java_user_input.asp

public class Application
{
	
	public static void main (String args[])
	{
		
		//prompt user for a number and store it in "input"
		System.out.print("Enter four digit integer to encrypt: ");
		Scanner UserData = new Scanner(System.in);
		//Capture user input
		String input = UserData.nextLine();
		//Call the encrypt method on the user's input string
		input = Encrypter.encrypt(input);
		System.out.println("Your encrypted integer is: " + input);
		System.out.print("Enter four digit integer to decrypt: ");
		//get user input to decrypt
		input = UserData.nextLine();
		//Call the decrypt method on the user's input string
		input = Decrypter.decrypt(input);
		System.out.println("Your decrypted integer is: " + input);
		
		UserData.close();
	}
	
	
}