package dailyChallenge;

public class UnderstandingOfStaticAndNonStaticKeywords {
	
	static String s1 = "Hello";
	String s2 = "World";
	
	
	public void display() {
		System.out.println("Non static method : "+ s1+" "+s2);
	}
	
	public static void displayStatic() {
		UnderstandingOfStaticAndNonStaticKeywords obj = new UnderstandingOfStaticAndNonStaticKeywords();
		System.out.println("Static method : "+ s1+" "+ obj.s2);
	}

	public static void main(String[] args) {
		
		UnderstandingOfStaticAndNonStaticKeywords obj = new UnderstandingOfStaticAndNonStaticKeywords();
		obj.display();
		UnderstandingOfStaticAndNonStaticKeywords.displayStatic();
	}
}
