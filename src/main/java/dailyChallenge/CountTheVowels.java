package dailyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountTheVowels {

	public static void main(String[] args) throws IOException {
		
		//Initialization
		String word; int count =0;
		
		//Getting input from the user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the word/sentence");
		word = br.readLine();
		word= word.toLowerCase();
		
		for (int i =0;i<word.length();i++)
		{
			switch (word.charAt(i))
			{
			case 'a': count++; break;
			case 'e': count++; break;
			case 'i': count++; break;
			case 'o': count++; break;
			case 'u': count++; break;
			}
		}
		System.out.println("No of vowels present in the given word/sentence,\""+word+"\" is : "+count);
	}

}
