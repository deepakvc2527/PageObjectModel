package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers {
	
	public BookHotelPage selectHotel() {
		clickByXpath(prop.getProperty("HotelListPage.BookHotel.Xpath"));
		return new BookHotelPage();
	}
	
	public HotelListPage switchingWindowForHotels() {
		switchToLastWindow();
		return this;
	}
	
	public HotelListPage waitForHotelListPage() {
		waitProperty(10000);
		return this;
	}

}
