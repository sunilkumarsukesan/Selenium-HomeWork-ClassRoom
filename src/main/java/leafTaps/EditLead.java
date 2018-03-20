package leafTaps;



import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class EditLead extends SeMethods{

	@Test
	public void editLead() throws InterruptedException {
		String newName = "sunil1";
		
		//launching the browser and entering the url
		startApp("Chrome", "http://leaftaps.com/opentaps/control/login");
		
		//logging into leaftaps
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		
		//entering into crm/sfa page
		click(locateElement("link","CRM/SFA"));
		
		//Finding the lead by first name
		click(locateElement("xpath","//a[text()='Leads']"));
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])[2]//input"), "sunil1");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//selecting the first result
		waitExplicitly("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		
		//Editing the first name
		verifyDisplayed(locateElement("xpath","//a[text()='Edit']"));
		click(locateElement("xpath","//a[text()='Edit']"));
		type(locateElement("xpath","//input[@id='updateLeadForm_firstName']"), newName);
		click(locateElement("xpath","//input[@value='Update']"));
		verifyExactText(locateElement("viewLead_firstName_sp"), newName);
		
		// checking whether leadid is updated with the new name or not
		if(locateElement("viewLead_firstName_sp").getText().equals(newName))
		{
			System.out.println("First name is successfully updated as "+ newName);
		}
		else
		{
			System.out.println("First name is not updated");
		}
		closeBrowser();
	}

}
