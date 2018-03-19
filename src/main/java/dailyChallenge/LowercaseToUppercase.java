package dailyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowercaseToUppercase {

	public static void main(String[] args) throws IOException {

		//Initialization
		int ASCII;
		String word, amendedWord ="";
		char changedLetter = 0;
		
		//Getting input from the user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		word = br.readLine();

		for (int i=0;i<word.length();i++)
		{
			//getting the ASCII value for each character of the password entered
			ASCII =(int)word.charAt(i);

			//checking whether the ASCII value falls on the below,
			//A-Z = 65 to 90
			//a-z = 97 to 122
			
			//if it is a lower case letter then it is changed to upper case
			if(ASCII>=97)
			{
				ASCII=ASCII-32;
				changedLetter = (char)ASCII;
			}
			else
			{
				changedLetter = (char)ASCII;
			}
			
			amendedWord=amendedWord+changedLetter;
		}
		System.out.println("\nChanged all the lowercase letters to uppercase letters : \n" + amendedWord);
	}

}
