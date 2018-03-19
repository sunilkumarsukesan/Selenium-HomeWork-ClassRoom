package week1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTaps {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement sourceElement = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDownAction = new Select(sourceElement);
		
		/*List<WebElement> AllOptionsOfSource = dropDownAction.getOptions();
		int count = AllOptionsOfSource.size();
		
		for (int i=0;i<=count-1;i++)
		{
			System.out.println("index = "+ i+", "+ AllOptionsOfSource.get(i).getText());
		}*/

	}

}
