package wdMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectMethods extends SeMethods{
	
	
	@Parameters ({"url","uName","pwd"})
	@BeforeMethod
	public void login(String url, String uName, String pwd) throws InterruptedException {
		//launching the browser and entering the url
		startApp("Chrome", url);

		//logging into leaftaps
		type(locateElement("username"), uName );
		type(locateElement("password"), pwd);
		click(locateElement("class", "decorativeSubmit"));

		//entering into crm/sfa page
		click(locateElement("link","CRM/SFA"));
	}
	
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}



}
