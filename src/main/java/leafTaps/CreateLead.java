package leafTaps;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	@Test (dataProvider = "FetchData")
	public void createLead(String companyName, String firstName, String lastName) {
		
		//creating the lead - clicking create lead link
		click(locateElement("link","Create Lead"));
		
		//Entering values in the mandatory fields
		type(locateElement("createLeadForm_companyName"), companyName);
		type(locateElement("xpath","//input[@id='createLeadForm_firstName']"), firstName);
		type(locateElement("xpath","//input[@id='createLeadForm_lastName']"), lastName);
		selectDropDownUsingIndex(locateElement("createLeadForm_dataSourceId"),2);
		
		//Clicking create lead button
		click(locateElement("xpath","//input[@value='Create Lead']"));
		
		//Displaying the newly created lead id
		int count = locateElement("viewLead_companyName_sp").getText().length();
		System.out.println(locateElement("viewLead_companyName_sp").getText().substring(count-6, count-1)
				+ " id is successfully created");
	}
	
	@DataProvider(name ="FetchData")
	public Object [][] getDataFromExcel() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		Object[][] data = excel.readExcel("data");
		return data;
	}
	
	@DataProvider(name ="FetchData1")
	public Object [][] getData()
	{
		Object [] [] data = new Object[2][3];
		
		data [0][0]="Test Leaf";
		data [0][1]="Mr";
		data [0][2]="X";
		
		data [1][0]="Test Leaf";
		data [1][1]="Mr";
		data [1][2]="Y";
		
		return data;
	}


}
