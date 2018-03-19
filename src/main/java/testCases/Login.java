package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{
	
	@Test
	public void login() {
		
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
	}

}













