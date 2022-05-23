package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {

	@Test
	public void generateReport() {
		
		
		// start Report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC006", "To verify IRCTC Registration for the new user sign up");
		
		test.assignAuthor("Deepak");
		
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		test.log(LogStatus.PASS	,"The browser got launched with the given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}
	
	
	
}
