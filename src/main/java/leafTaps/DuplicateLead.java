package leafTaps;

import org.testng.annotations.Test;
import wdMethods.SeMethods;

public class DuplicateLead extends SeMethods{

	@Test (invocationCount=2, threadPoolSize=3)
	public void findLeads() {
		//launching the browser and entering the url
		startApp("Chrome", "http://leaftaps.com/opentaps/control/login");
		verifyTitle("Leaftaps - TestLeaf Automation Platform");
		
		//logging into leaftaps
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		
		//verifying attribute of crm/sfa link
		verifyPartialAttribute(locateElement("link","CRM/SFA"), "href", "/crmsfa/control/main");
		
		//entering into crm/sfa page
		click(locateElement("link","CRM/SFA"));
		
		//Finding the lead by first name
		click(locateElement("xpath","//a[text()='Leads']"));
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])[2]//input"), "sunil");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//selecting the first result
		waitExplicitly("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		//Clicking on duplicate lead
		click(locateElement("link","Duplicate Lead"));
		click(locateElement("xpath","//input[@value='Create Lead']"));
		
		//displaying the newly created duplicate lead id
		int count = locateElement("viewLead_companyName_sp").getText().length();
		System.out.println(locateElement("viewLead_companyName_sp").getText().substring(count-6, count-1)
				+ " duplicate id is successfully created");
		closeBrowser();
	}

}
