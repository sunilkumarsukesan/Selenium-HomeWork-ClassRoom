package dailyChallenge;

public class Car extends Vehicle{
	Car()
	{
		System.out.println("Car is the sub class of Vehicle class");
		applyBrake();
	}
	public void applyBrake()
	{
		System.out.println("Brake Applied - Car brake");
	}

}
