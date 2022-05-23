package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers {
	
	public HotelsLoginPage clickOnLoginButton() {
		clickByXpath(prop.getProperty("HotelsLoginPage.Login.Xpath"));
		return new HotelsLoginPage();
	}
	
	public HotelsPage enterHotelCity(String city) {
		enterByXpath(prop.getProperty("HotelsPage.HotelCity.Xpath"), city);
		return this;
	}
	
	public HotelsPage clickOnHotelCity() {
		clickByXpath(prop.getProperty("HotelsPage.ClickCity.Xpath"));
		return this;
	}
	
	public HotelsPage clickFromDate() {
		clickByXpath(prop.getProperty("HotelsPage.FromDateBox.Xpath"));
		return this;
	}
	
	public HotelsPage selectFromDate() {
		clickByXpath(prop.getProperty("HotelsPage.FromDate.Xpath"));
		return this;
	}
	
	public HotelsPage clickToDate() {
		clickByXpath(prop.getProperty("HotelsPage.ToDateBox.Xpath"));
		return this;
	}
	
	public HotelsPage clickOnNextMonth() {
		clickByXpath(prop.getProperty("HotelsPage.NextMonth.Xpath"));
		return this;
	}
	
	public HotelsPage selectToDate() {
		clickByXpath(prop.getProperty("HotelsPage.ToDate.Xpath"));
		return this;
	}
	
	public HotelsPage clickRoomsGuests() {
		clickByXpath(prop.getProperty("HotelsPage.ClickRoomsGuests.Xpath"));
		return this;
	}
	
	public HotelsPage selectNoOfRooms(String rooms) {
		selectValueByXpath(prop.getProperty("HotelsPage.NoOfRooms.Xpath"), rooms);
		return this;
	}
	
	public HotelsPage selectNoOfAdults(String adults) {
		selectValueByXpath(prop.getProperty("HotelsPage.NoOfAdults.Xpath"), adults);
		return this;
	}
	
	public HotelsPage clickOnDone() {
		clickByXpath(prop.getProperty("HotelsPage.Done.Xpath"));
		return this;
	}
	
	public HotelListPage clickFindHotel() {
		clickByXpath(prop.getProperty("HotelsPage.FindHotel.Xpath"));
		return new HotelListPage();	
		
	}
	
	public HotelsPage switchingWindowForHotels() {
		switchToLastWindow();
		return this;
	}
	
	public HotelsPage waitForHotelsPage() {
		waitProperty(7000);
		return this;
	}


}
