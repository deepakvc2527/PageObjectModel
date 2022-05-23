package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolsAlertPages;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC010";
		testCaseDescription = "SimpleAlert";
		author = "Deepak";
		category="Smoke";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	@Test
	public void alertTryIt() {
		
		new W3SchoolsAlertPages()
		.switchToFrame()
		.clickOnTryItButton()
		.printAlertText()
		.clickOnOkButton()
		.switchingToDefault()
		.clickOnHomeButton();
		
	}

}
