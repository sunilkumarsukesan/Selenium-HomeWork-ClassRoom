package week1day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindLeads {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println(driver.findElementByLinkText("CRM/SFA").getAttribute("href"));
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByXPath("//a[text()='Leads']").click();;
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[2]//input").sendKeys("sunil");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//.Thread.sleep(3000);
		
		/*//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[2]")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1])[2]").click();
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_firstName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_firstName']").sendKeys("Gopi2");*/
		//driver.findElementByXPath("//input[@value='Update']").click();		
		/*List<WebElement> AllOptionsOfSource = dropDownAction.getOptions();
		int count = AllOptionsOfSource.size();
		
		for (int i=0;i<=count-1;i++)
		{
			System.out.println("index = "+ i+", "+ AllOptionsOfSource.get(i).getText());
		}*/

	}

}
