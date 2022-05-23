package pom.facebook.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public SignUpPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("FacebookHomePage.CreateNewAccount.Xpath"));
		return new SignUpPage();
	}

}
