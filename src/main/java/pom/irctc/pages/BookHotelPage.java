package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookHotelPage extends GenericWrappers {
	
	public BookingDetailsPage clickOnBookHotel() {
		clickByXpath(prop.getProperty("IrctcBookHotelPage.ClickOnBookHotel.Xpath"));
		return new BookingDetailsPage();
	}
	
	public BookHotelPage switchingWindowForHotels() {
		switchToLastWindow();
		return this;
	}
	
	public BookHotelPage waitForBookHotelPage() {
		waitProperty(5000);
		return this;
	}

}
