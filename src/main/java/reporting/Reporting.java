package reporting;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reporting {
	
	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./Reports/report.html");
		html.setAppendExisting(false);
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC001_CreateLead", "Create a new lead in lead");
		test.assignAuthor("Sunil");
		test.assignCategory("Smoke");
		
		test.pass("Username entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img_02-03-18 15-58-45.jpg", "username").build());
		test.pass("Password entered successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img_02-03-18 15-58-46.jpg", "password").build());
		extent.flush();
	}

}
