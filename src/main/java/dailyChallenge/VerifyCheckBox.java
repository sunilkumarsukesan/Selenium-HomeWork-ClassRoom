package dailyChallenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckBox {

	public static void main(String[] args) {
		
		//setting the driver path
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//creating an instance of Chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//maximising the browser window
		driver.manage().window().maximize();
		
		//entering the url on the browser
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//assigning the webelement
		WebElement checkBox = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following::input");
		
		//checking whether checkbox is selected or not
		if(checkBox.isSelected())
		{
			System.out.println("Checkbox is checked");
		}
		else
		{
			System.out.println("Checkbox is unchecked");
		}
		
		//assigning another webelement
		checkBox = driver.findElementByXPath("(//div[@class='example'])[3]/input[1]");

		//checking whether checkbox is selected or not
		if(checkBox.isSelected())
		{
			System.out.println("Checkbox is checked");
		}
		else
		{
			System.out.println("Checkbox is unchecked");
		}
	}

}