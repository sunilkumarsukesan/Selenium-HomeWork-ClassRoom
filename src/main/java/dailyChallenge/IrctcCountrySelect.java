package dailyChallenge;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcCountrySelect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
	
		Select dropDownOptions = new Select(driver.findElementById("userRegistrationForm:countries"));
		List<WebElement> dropDownalloptions = dropDownOptions.getOptions();
		int count = dropDownalloptions.size();
		for(int i=0;i<count;i++)
		{
			if(dropDownalloptions.get(i).getText().startsWith("E"))
			{
				if(dropDownalloptions.get(i+1).getText().equals("Egypt"))
						{
						System.out.println("Second country that starts with E is ,"+dropDownalloptions.get(i+1).getText());
						dropDownOptions.selectByIndex(i+1);
						}
			}
		}
	}

}
