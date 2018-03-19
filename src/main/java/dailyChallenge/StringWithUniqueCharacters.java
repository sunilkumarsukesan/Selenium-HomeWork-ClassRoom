package dailyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringWithUniqueCharacters {

	public static void main(String[] args) throws IOException {

		String enteredString, formattedString="",stringCheck ="";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string");
		enteredString = br.readLine();
		
		enteredString = enteredString.toLowerCase();

		for (int i =0;i<enteredString.length();i++)
		{
			stringCheck = ""+enteredString.charAt(i);
			if(!(formattedString.contains(stringCheck)))
			{
				formattedString=formattedString+enteredString.charAt(i);
			}
		}
		System.out.println(formattedString);
	}
}
