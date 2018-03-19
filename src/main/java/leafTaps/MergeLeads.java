package leafTaps;

import org.junit.Test;

import wdMethods.SeMethods;

public class MergeLeads extends SeMethods{

	@Test
	public void mergeLeads() {
		//launching the browser and entering the url
		startApp("Chrome", "http://leaftaps.com/opentaps/control/login");
		
		//logging into leaftaps
		type(locateElement("username"), "DemoSalesManager");
		type(locateElement("password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		
		//entering into crm/sfa page
		click(locateElement("link","CRM/SFA"));
		
		//merging the leads
		click(locateElement("xpath","//a[text()='Leads']"));
		click(locateElement("link","Merge Leads"));
		
		//finding the first lead using id
		click(locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element'])[1]/input"),"11969");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		waitExplicitly("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickWithoutSnap(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		switchToWindow(0);
		
		//Finding the second lead using id
		click(locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element'])[1]/input"),"11245");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		waitExplicitly("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickWithoutSnap(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		switchToWindow(0);
		
		//Merging two leads
		clickWithoutSnap(locateElement("link","Merge"));
		acceptAlert();
		click(locateElement("link","Find Leads"));
		type(locateElement("xpath","(//div[@class='x-form-item x-tab-item'])[1]//input"),"11969");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//verifying whether leads have been merged or not
		if(locateElement("xpath","//div[text()='No records to display']").isDisplayed())
		{
			System.out.println("Merged Successfully");
		}
		else
		{
			System.out.println("Lead ids are not merged");
		}
		closeBrowser();
	}

}
