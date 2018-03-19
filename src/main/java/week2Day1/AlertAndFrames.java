package week2Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrames {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialization
		String name = "Sunil";
		
		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//creating a new object
		ChromeDriver driver = new ChromeDriver();
		
		//Maximizing the browser
		driver.manage().window().maximize();
		
		//Entering the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Switching to a frame
		//by id
		//driver.switchTo().frame("iframeResult");
		
		//by index
		driver.switchTo().frame(13);
		
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		//Switching to an alert
	
		Alert newAlert = driver.switchTo().alert();
		newAlert.sendKeys(name);
		newAlert.accept();
		
		//Verifying name whether the given in the alert box gets displayed on the frame or not
		if(driver.findElementById("demo").getText().contains(name))
		{
			System.out.println("Given name,\""+ name+"\" in the textbox got displayed inside the frame");
		}
		Thread.sleep(3000);
		driver.close();
	}
}
