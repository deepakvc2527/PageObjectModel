package pom.alerts.pages;

import wrappers.GenericWrappers;

public class W3SchoolsAlertPages extends GenericWrappers {
	
	public W3SchoolsAlertPages switchToFrame() {
		switchToFrame("iframeResult");
		return this;
	}
	
	public W3SchoolsAlertPages clickOnTryItButton() {
		clickByXpath(prop.getProperty("W3SchoolsAlertsPage.ClickOnTryItButton.Xpath"));
		return this;
	}
	
	public W3SchoolsAlertPages enterInputText(String data) {
		InputAlertText(data);
		return this;
	}
	
	
	public W3SchoolsAlertPages clickOnOkButton() {
		acceptAlert();
		return this;
	}
	
	public W3SchoolsAlertPages printAlertText() {
		 getAlertText();
		 return this;
	}
	
	
	public W3SchoolsAlertPages clickOnCancelButton() {
		dismissAlert();
		return this;
	}
	
	public W3SchoolsAlertPages verifyText(String text) {
		verifyTextContainsByXpath(prop.getProperty("W3SchoolsAlertsPage.VerifyText.Xpath"), text);
		return this;
	}
	
	public W3SchoolsAlertPages switchingToDefault() {
		switchToDefaultCont();
		return this;
	}
	
	public HomePage clickOnHomeButton() {
		clickByXpath(prop.getProperty("W3SchoolsAlertsPage.ClickOnHomeButton.Xpath"));
		return new HomePage();
	}
	
	public W3SchoolsAlertPages refreshPage() {
		refresh();
		return this;
	}
	
	public W3SchoolsAlertPages waitForAlertsPage() {
		waitProperty(5000);
		return this;
	}

}
