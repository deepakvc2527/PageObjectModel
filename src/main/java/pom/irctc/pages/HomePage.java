package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("IrctcHomePage.Register.Xpath"));
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath(prop.getProperty("IrctcHomePage.MoveToHolidays.Xpath"));
		return this;
	}
	
	public HomePage clickOnOnHolidays() {
		clickByXpath(prop.getProperty("IrctcHomePage.Holidays.Xpath"));
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath(prop.getProperty("IrctcHomePage.MoveToStays.Xpath"));
		return this;
	}
	
	public HomePage mouseHoverOnLounge() {
		mouseHoverByXpath(prop.getProperty("IrctcHomePage.MoveToLounge.Xpath"));
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath(prop.getProperty("IrctcAccomodationPage.Lounge.Xpath"));
		return new AccommodationPage();
	}
	
	public HomePage waitForHomePage() {
		waitProperty(9000);
		return this;
	}
	
}
