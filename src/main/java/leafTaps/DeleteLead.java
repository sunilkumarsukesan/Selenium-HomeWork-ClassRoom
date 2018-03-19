package leafTaps;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class DeleteLead extends SeMethods{

	@Test
	public void deleteLeads() {

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
		String leadid = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));

		//deleting the first result
		click(locateElement("link","Delete"));

		//verifying whether the lead has been deleted or not
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])[2]//input"), leadid);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		if(locateElement("xpath","//div[text()='No records to display']").isDisplayed())
		{
			System.out.println("leadid, " +leadid + " has been deleted successfully");
		}
		else
		{
			System.out.println(leadid+ " still exits");
		}

	}

}
