package dailyChallenge;

public class Vehicle {
	Vehicle(){
		System.out.println("Vehicle - Super class");
		applyBrake();
	}
	public void applyBrake()
	{
		System.out.println("Brake Applied");
	}

}
