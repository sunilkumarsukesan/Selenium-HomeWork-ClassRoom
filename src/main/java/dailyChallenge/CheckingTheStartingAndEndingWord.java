package dailyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckingTheStartingAndEndingWord {

	public static void main(String[] args) throws IOException {

		String sentence; boolean startStatus = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence");
		sentence = br.readLine();

		if(sentence.startsWith("Hello"))
		{
			System.out.println("Entered sentence, \""+sentence + "\" starts with the expected word \"Hello\"");
			startStatus= true;
		}
		else
		{	
			System.err.println("Entered sentence, \""+sentence + "\" doesnt starts with the expected word \"Hello\"");
		}
		if(sentence.endsWith("TestLeaf"))
		{
			if(startStatus) {
				System.out.println("Entered sentence, \""+sentence + "\" ends with the expected word \"TestLeaf\"");
			}
			else
			{
				System.out.println("However entered sentence, \""+sentence + "\" ends with the expected word \"TestLeaf\"");	
			}
		}
		else	
		{
			if(!startStatus) {
				System.err.println("Entered sentence, \""+sentence + "\" doesnt ends with the expected word \"TestLeaf\"");
			}
			else
			{
				System.err.println("However entered sentence, \""+sentence + "\" doesnt ends with the expected word \"TestLeaf\"");
			}
		}

	}
}
