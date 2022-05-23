package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {
	
	
	public HomePage clickOnOK() {
		clickByXpath(prop.getProperty("IrctcCovidAlertPage.ClickOnOK.Xpath"));
		return new HomePage();
	}

}
