package dailyChallenge;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastbutOneDropDown {

	public static void main(String[] args) {
		
		//setting the driver path
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//creating an instance of Chrome driver
		ChromeDriver driver = new ChromeDriver();
		
		//maximizing the browser window
		driver.manage().window().maximize();
		
		//entering the url
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//assigning a webelement
		WebElement dropdown1 = driver.findElementById("dropdown1");
		
		//passing the webelement to the newly created instance of select class
		Select dropDownOptions = new Select(dropdown1);
		
		//using list to get all the options in the dropdown
		List<WebElement> dropDownalloptions = dropDownOptions.getOptions();
		
		//getting the total count of the dropdown options
		int count = dropDownalloptions.size();
		
		//using index, selecting the last but one option
		dropDownOptions.selectByIndex(count-2);
		
		//passing another webelement to the already instance of select class
		dropDownOptions = new Select(driver.findElementByXPath("(//div[@class='example'])[5]/select"));
		
		//using list to get all the options in the dropdown
		dropDownalloptions = dropDownOptions.getOptions();
		
		//getting the total count of the dropdown options
		count = dropDownalloptions.size();
		
		//using index selecting the last but one option
		dropDownOptions.selectByIndex(count-2);
		
	}

}
