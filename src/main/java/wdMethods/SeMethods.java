package wdMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver;

	@Override
	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"./drivers/chromedriver.exe");		
				driver = new ChromeDriver();			
			}else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"./drivers/geckodriver.exe");		
				driver = new FirefoxDriver();		
			}		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);		
			System.out.println("The Browser "+browser+" launched Successfully");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NoSuchSessionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		takeSnap();
	}

	@Override
	public WebElement locateElement(String locator, String locValue) {

		switch(locator) {		
		case "id": return driver.findElementById(locValue);
		case "name": return driver.findElementByName(locValue);
		case "link": return driver.findElementByLinkText(locValue);
		case "class": return driver.findElementByClassName(locValue);
		case "xpath": return driver.findElementByXPath(locValue);		
		}		
		return null;
	}

	@Override
	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);	
	}

	@Override
	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		System.out.println("The Element "+ele+" is entered with "+data);
		takeSnap();
	}
	
	public void keysAction(WebElement ele,String action) {
		switch (action)
		{
		case "Tab": ele.sendKeys(Keys.TAB);
		case "Enter" : ele.sendKeys(Keys.ENTER);
		}
	}


	@Override
	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked");
		takeSnap();
	}

	@Override
	public void clickWithoutSnap(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked");
	}

	@Override
	public String getText(WebElement ele) {
		if(ele.isDisplayed())
		{
			System.out.println("Value of the returned text, "+ ele.getText());
			return ele.getText();
		}
		else
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dropdownOptions = new Select(ele);
		dropdownOptions.selectByValue(value);
		takeSnap();
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dropdownOptions = new Select(ele);
		dropdownOptions.selectByIndex(index);
		takeSnap();
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		if(expectedTitle.equals(driver.getTitle()))
		{
		System.out.println("Page title matches with the expected title");
		return true;
		}
		else
		{
		System.out.println("Page title doesnt match with the expected title");
		return false;
		}
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		if(expectedText.equals(ele.getText()))
		{
		System.out.println("The Element "+ ele + " returned text, " + ele.getText() + " matches with the expected text");
		}
		else
		{
		System.out.println("The Element "+ ele + " returned text, " + ele.getText() + " doesnt match with the expected text");
		}

	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		if(expectedText.contains(ele.getText()))
		{
		System.out.println("The Element "+ ele + " returned text, " + ele.getText() + " contains the expected text");
		}
		else
		{
		System.out.println("The Element "+ ele + " returned text, " + ele.getText() + " doesnt contain the expected text");
		}
	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value))
		{
		System.out.println("The Attribute value, "+ ele.getAttribute(attribute) + " of Attribute "+ attribute +" is verified successfully");
		}
		else
		{
		System.out.println("The Attribute value, "+ ele.getAttribute(attribute) + " of Attribute "+ attribute +" is not verified");
		}
	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).contains(value))
		{
		System.out.println("The Attribute value, "+ ele.getAttribute(attribute) + " of Attribute "+ attribute +" contains "+ value);
		}
		else
		{
		System.out.println("The Attribute value, "+ ele.getAttribute(attribute) + " of Attribute "+ attribute +" doesnt containt "+ value);
		}
	}

	@Override
	public void verifySelected(WebElement ele) {
		if(ele.isSelected())
		{
		System.out.println("The Element "+ ele + " is selected");
		}
		else
		{
		System.out.println("The Element "+ ele + " is not selected");
		}
	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed())
		{
		System.out.println("The Element "+ ele + " is getting displayed");
		}
		else
		{
		System.out.println("The Element "+ ele + " is not getting displayed");
		}
	}
	
	public void typeAndTab(WebElement ele, String value)
	{
		click(ele);
		type(ele, value);
		keysAction(ele,"Tab");
	}



	@Override
	public void switchToWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> arrayList = new ArrayList<String>();
		arrayList.addAll(windowHandles);
		driver.switchTo().window(arrayList.get(index));
	}

	@Override
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	public void switchToFrameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToParentFromChildFrame()
	{
		driver.switchTo().defaultContent();
	}


	@Override
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	@Override
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlertText() {
		if(driver.switchTo().alert().getText()!="")
		{
			System.out.println("Value of the alert text, "+ driver.switchTo().alert().getText());
			return driver.switchTo().alert().getText();
		}
		else
		return null;
	}

	@Override
	public void takeSnap() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date=new Date();
		String imageName = dateFormat.format(date);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img_"+ imageName +".jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public String getAttributeValue(WebElement ele, String value) {
		if(ele.isDisplayed())
		{
			return ele.getAttribute(value);
		}
		
		else		
		return null;
		
	}

	public void waitExplicitly(String locator, String locValue) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		switch(locator) {		
		case "id": wait.until(ExpectedConditions.elementToBeClickable(By.id(locValue)));		
		case "name": wait.until(ExpectedConditions.elementToBeClickable(By.name(locValue)));		
		case "link": wait.until(ExpectedConditions.elementToBeClickable(By.linkText(locValue)));		
		case "class": wait.until(ExpectedConditions.elementToBeClickable(By.className(locValue)));		
		case "xpath": wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locValue)));		
		}		
	}
	
	public void waitExplicitlyele(String locator, String locValue) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		switch(locator) {		
		case "id": wait.until(ExpectedConditions.visibilityOf(locateElement(locValue)));		
		case "name": wait.until(ExpectedConditions.elementToBeClickable(By.name(locValue)));		
		case "link": wait.until(ExpectedConditions.elementToBeClickable(By.linkText(locValue)));		
		case "class": wait.until(ExpectedConditions.elementToBeClickable(By.className(locValue)));		
		case "xpath": wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locValue)));		
		}		
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}
}
