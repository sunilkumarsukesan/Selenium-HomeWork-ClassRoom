package week2Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		
		//
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> arrayList = new ArrayList<String>();
		arrayList.addAll(windowHandles);
		driver.switchTo().window(arrayList.get(1));
		driver.findElementByXPath("(//div[@class='x-form-element'])[1]/input").sendKeys("10663");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a").click();
		
		windowHandles = driver.getWindowHandles();
		arrayList = new ArrayList<String>();
		arrayList.addAll(windowHandles);
		driver.switchTo().window(arrayList.get(0));
		
		//driver.switchTo().window(arrayList.get(0));
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		windowHandles = driver.getWindowHandles();
		arrayList = new ArrayList<String>();
		arrayList.addAll(windowHandles);
		driver.switchTo().window(arrayList.get(1));
		driver.findElementByXPath("(//div[@class='x-form-element'])[1]/input").sendKeys("10673");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]")));
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]").click();
		driver.switchTo().window(arrayList.get(0));
		driver.findElementByLinkText("Merge").click();
		//driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'])[1]//input").sendKeys("10278");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		if(driver.findElementByXPath("//div[text()='No records to display']").isDisplayed())
		{
			System.out.println("No record to display error message got displayed");
		}
		driver.close();
		
	}

}
