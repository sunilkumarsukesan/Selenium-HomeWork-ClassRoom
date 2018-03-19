package serviceNow;

import org.junit.Test;

import wdMethods.SeMethods;

public class ChangingTheStatusOfTheIncident extends SeMethods{
	
	@Test
	public void changingTheStatusOfTheIncident() throws InterruptedException {
		String incidentNumber;
		startApp("Chrome","https://dev47818.service-now.com/");
		switchToFrameByIndex(0);
		type(locateElement("id","user_name"),"admin");
		type(locateElement("user_password"),"Ayshu@123");
		click(locateElement("xpath","//button[text()='Login']"));
		switchToParentFromChildFrame();
		type(locateElement("filter"),"Incident");
		Thread.sleep(3000);
		waitExplicitly("xpath","//div[text()='Open - Unassigned']");
		verifyDisplayed(locateElement("xpath","//div[text()='Open - Unassigned']"));
		Thread.sleep(3000);
		click(locateElement("xpath","//div[text()='Open - Unassigned']"));
		switchToFrame(locateElement("gsft_main"));
		Thread.sleep(3000);
		type(locateElement("xpath","(//input[@class='form-control'])[1]"),"INC001");
		keysAction(locateElement("xpath","(//input[@class='form-control'])[1]"),"Enter");
		Thread.sleep(3000);
		waitExplicitly("xpath","(//a[@class='linked formlink'])[1]");
		click(locateElement("xpath","(//a[@class='linked formlink'])[1]"));
		Thread.sleep(3000);
		incidentNumber = getAttributeValue(locateElement("xpath","//input[@id='incident.number']"),"value");
		System.out.println("Captured the incident number : " + incidentNumber);
		selectDropDownUsingIndex(locateElement("incident.state"),1);
		click(locateElement("sysverb_update"));
		Thread.sleep(3000);
		type(locateElement("xpath","(//input[@class='form-control'])[1]"),incidentNumber);
		keysAction(locateElement("xpath","(//input[@class='form-control'])[1]"),"Enter");
		Thread.sleep(3000);
		System.out.println(getText(locateElement("xpath","(//a[@class='linked formlink'])[1]")));
		if((getText(locateElement("xpath","(//a[@class='linked formlink'])[1]")).equals(incidentNumber))
				&&
				(getText(locateElement("xpath","(//td[@class='vt'])[6]")).equals("In Progress")))
		{
			System.out.println("Incident state is changed to \"In progress\"");
		}
	}

}
