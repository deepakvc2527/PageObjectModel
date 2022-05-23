package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolsAlertPages;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC012";
		testCaseDescription = "Prompt Alert";
		author = "Deepak";
		category="Smoke";
		url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
	}
	
	@Test
	
	public void alertPrompt() {
		
		new W3SchoolsAlertPages()
		.switchToFrame()
		.clickOnTryItButton()
		.enterInputText("Deepak")
		.printAlertText()
		.clickOnOkButton()
		.verifyText("Deepak")
		.refreshPage()
		.waitForAlertsPage()
		.switchToFrame()
		.clickOnTryItButton()
		.enterInputText("Deepak")
		.printAlertText()
		.clickOnCancelButton()
		.verifyText("User cancelled the prompt.")
		.switchingToDefault()
		.clickOnHomeButton();
	}

}
