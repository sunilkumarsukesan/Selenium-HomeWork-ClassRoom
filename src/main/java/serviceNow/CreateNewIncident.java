package serviceNow;

import org.junit.Test;

import wdMethods.SeMethods;

public class CreateNewIncident extends SeMethods{
	
	@Test
	public void login() throws InterruptedException{
		String incidentNumber;
		
		startApp("Chrome","https://dev47818.service-now.com/");
		switchToFrameByIndex(0);
		type(locateElement("id","user_name"),"admin");
		type(locateElement("user_password"),"Ayshu@123");
		click(locateElement("xpath","//button[text()='Login']"));
		switchToParentFromChildFrame();
		type(locateElement("filter"),"Incident");
		Thread.sleep(5000);
		waitExplicitly("xpath","//div[text()='Create New']");
		verifyDisplayed(locateElement("xpath","//div[text()='Create New']"));
		Thread.sleep(5000);
		click(locateElement("xpath","//div[text()='Create New']"));
		switchToFrame(locateElement("gsft_main"));
		Thread.sleep(3000);
		incidentNumber = getAttributeValue(locateElement("xpath","//input[@id='incident.number']"),"value");
		System.out.println("Captured the incident number : " + incidentNumber);
		//typeAndTab(locateElement("sys_display.incident.caller_id"), "System Administrator");
		Thread.sleep(3000);
		clickWithoutSnap(locateElement("lookup.incident.caller_id"));
		switchToWindow(1);
		type(locateElement("xpath","(//input[@class='form-control'])[1]"),"System Administrator");
		keysAction(locateElement("xpath","(//input[@class='form-control'])[1]"), "Enter");
		Thread.sleep(3000);
		waitExplicitly("xpath","(//a[@class='glide_ref_item_link'])[1]");
		clickWithoutSnap(locateElement("xpath","(//a[@class='glide_ref_item_link'])[1]"));
		Thread.sleep(2000);
		switchToWindow(0);
		switchToFrame(locateElement("gsft_main"));
		typeAndTab(locateElement("incident.short_description"),"Related to software issue");
		Thread.sleep(3000);
		click(locateElement("xpath","(//button[text()='Submit'])[1]"));
		Thread.sleep(5000);
		type(locateElement("xpath","(//input[@class='form-control'])[1]"),incidentNumber);
		keysAction(locateElement("xpath","(//input[@class='form-control'])[1]"),"Enter");
		Thread.sleep(2000);
		waitExplicitly("xpath","//a[@class='linked formlink']");
		if(getText(locateElement("xpath","//a[@class='linked formlink']")).equals(incidentNumber))
		{
			System.out.println("Incident has been created successfully and the number is ,"+incidentNumber);
		}
		
	}	
}
