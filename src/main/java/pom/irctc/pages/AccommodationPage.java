package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers {
	
	public HotelsPage clickOnHotels( ) {
		clickByXpath(prop.getProperty("IrctcAccommodationPage.ClickOnHotels.Xpath"));
		return new HotelsPage();
	}
	
	public AccommodationPage clickOnOptions() {
		clickByXpath(prop.getProperty("IrctcAccommodationPage.ClickOnOptions.Xpath"));
		return new AccommodationPage();
	}
	
	public CharterPage clickOnCharter() {
		clickByXpath(prop.getProperty("IrctcAccommodationPage.ClickOnCharter.Xpath"));
		return new CharterPage();
		
	}
	
	public BookYourCoachOrTrainPage clickOnBookYourCoach() {
		clickByXpath(prop.getProperty("IrctcAccommodationPage.ClickOnBookYourCoach.Xpath"));
		return new BookYourCoachOrTrainPage();
		
	}
	
	public AccommodationPage switchingWindowforAccomodation() {
		switchToLastWindow();
		return this;
	}
	

}
