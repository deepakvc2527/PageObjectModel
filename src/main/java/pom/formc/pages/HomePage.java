package pom.formc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public UserRegistrationPage clickOnSignUp() {
		clickByXpath(prop.getProperty("FormCHomePage.SignUp.Xpath"));
		return new UserRegistrationPage();
	}

}
