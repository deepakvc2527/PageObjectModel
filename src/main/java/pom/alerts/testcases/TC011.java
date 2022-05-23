package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolsAlertPages;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC011";
		testCaseDescription = "Confirmation Alert";
		author = "Deepak";
		category="Smoke";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
	}
	@Test
	public void alertConfirm() {
		
		new W3SchoolsAlertPages()
		.switchToFrame()
		.clickOnTryItButton()
		.printAlertText()
		.clickOnOkButton()
		.verifyText("You pressed OK!")
		.refreshPage()
		.waitForAlertsPage()
		.switchToFrame()
		.clickOnTryItButton()
		.printAlertText()
		.clickOnCancelButton()
		.verifyText("You pressed Cancel!")
		.switchingToDefault()
		.clickOnHomeButton();
		
	}

}
