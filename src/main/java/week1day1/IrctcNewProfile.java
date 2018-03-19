package week1day1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcNewProfile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("sunil9600022");
		driver.findElementById("userRegistrationForm:password").sendKeys("Testing@123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Testing@123");
		
		//By selecting 2nd last option from the dropdown
		WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");
		Select dropDownOptions = new Select(securityQ);
		List<WebElement> allSecurityQoptions = dropDownOptions.getOptions();
		int count = allSecurityQoptions.size();
		dropDownOptions.selectByIndex(count-2);
		
		//using sendkeys
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Apache");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sunil");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Kumar");
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("16");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("FEB");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1990");
		
		// by index
		dropDownOptions = new Select(driver.findElementById("userRegistrationForm:occupation"));
		dropDownOptions.selectByIndex(4);
		
		// by visible text
		dropDownOptions = new Select(driver.findElementById("userRegistrationForm:countries"));
		dropDownOptions.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("sunilkumar.sukesan@gmail.com");
		
		//by value
		dropDownOptions = new Select(driver.findElementById("userRegistrationForm:nationalityId"));
		dropDownOptions.selectByValue("94");
		driver.findElementById("userRegistrationForm:address").sendKeys("No 22 Periyar st");
		driver.findElementById("userRegistrationForm:street").sendKeys("Gandhi Nagar");
		driver.findElementById("userRegistrationForm:area").sendKeys("Pattabiram");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600072");
		driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		dropDownOptions = new Select(driver.findElementById("userRegistrationForm:cityName"));
		dropDownOptions.selectByIndex(1);
		Thread.sleep(3000);
		dropDownOptions = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		
		//printing all values
		List<WebElement> allDropDownoptions = dropDownOptions.getOptions();
		count = allDropDownoptions.size();
		for (int i=0;i<count;i++)
		{
			System.out.println(allDropDownoptions.get(i).getText());
			if (allDropDownoptions.get(i).getText().equals("Pattabiram S.O"))
			{
				dropDownOptions.selectByIndex(i);
			}
		}
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("044-26852990");
		System.out.println("\n Completed!");
	}

}
