package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsLoginPage extends GenericWrappers {
	
	public HotelsLoginPage clickOnGuestUser() {
		clickByXpath(prop.getProperty("HotelsLoginPage.GuestUser.Xpath"));
		return this;
	}
	
	public HotelsLoginPage enterEmail(String email) {
		enterByXpath(prop.getProperty("HotelsLoginPage.Email.Xpath"), email);
		return this;
	}
	
	public HotelsLoginPage enterMobileNo(String mobile) {
		enterByXpath(prop.getProperty("HotelsLoginPage.Mobile.Xpath"), mobile);
		return this;
	}
	
	public HotelsPage clickOnLogin() {
		clickByXpath(prop.getProperty("HotelsPage.Login.Xpath"));
		return new HotelsPage();
	}
	
	
	
}
