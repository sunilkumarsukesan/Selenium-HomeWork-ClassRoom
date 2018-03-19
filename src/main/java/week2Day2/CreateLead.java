package week2Day2;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class CreateLead extends SeMethods{
	
	@Test
	public void createLead() {
		startApp("Chrome", "http://leaftaps.com/opentaps/control/login");
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
		
		WebElement password = locateElement("password");
		type(password, "crmsfa");
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		click(locateElement("link","CRM/SFA"));
		click(locateElement("link","Create Lead"));
		type(locateElement("createLeadForm_companyName"), "Test");
		type(locateElement("xpath","//input[@id='createLeadForm_firstName']"), "Sunil");
		type(locateElement("xpath","//input[@id='createLeadForm_lastName']"), "Kumar");
		selectDropDownUsingIndex(locateElement("createLeadForm_dataSourceId"),2);
		click(locateElement("xpath","//input[@value='Create Lead']"));
	}
	

}
