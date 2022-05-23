package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookingDetailsPage extends GenericWrappers {
	
	public BookingDetailsPage selectTitle(String title) {
		selectVisibleTextByXpath(prop.getProperty("IrctcBookingDetailsPage.SelectTitle.Xpath"), title);
		return this;
	}
	
	public BookingDetailsPage enterFirstName(String fname) {
		enterByXpath(prop.getProperty("IrctcBookingDetailsPage.EnterFirstName.Xpath"), fname);
		return this;
	}
	
	public BookingDetailsPage enterLastName(String lname) {
		enterByXpath(prop.getProperty("IrctcBookingDetailsPage.EnterLastName.Xpath"), lname);
		return this;
	}
	
	public BookingDetailsPage selectCountry(String country) {
		selectValueByXpath(prop.getProperty("IrctcBookingDetailsPage.SelectCountry.Xpath"), country);
		return this;
	}
	
	public BookingDetailsPage selectState(String state) {
		selectVisibleTextByXpath(prop.getProperty("IrctcBookingDetailsPage.SelectState.Xpath"), state);
		return this;
	}
	
	public BookingDetailsPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("IrctcBookingDetailsPage.EnterMobile.Xpath"), mobile);
		return this;
	}
	
	public BookingDetailsPage enterEmail(String email) {
		enterByXpath(prop.getProperty("IrctcBookingDetailsPage.EnterEmail.Xpath"), email);
		return this;
	}
	
	public BookingDetailsPage selectGstNo(String gst1) {
		selectValueByXpath(prop.getProperty("IrctcBookingDetailsPage.SelectGstNo.Xpath"), gst1);
		return this;
	}
	
	public BookingDetailsPage selectGstYes(String gst2) {
		selectValueByXpath(prop.getProperty("IrctcBookingDetailsPage.SelectGstYes.Xpath"), gst2);
		return this;
	}
	
	public BookingDetailsPage enterGstin(String gstin) {
		enterByXpath(prop.getProperty("IrctcBookingDetailsPage.EnterGstin.Xpath"), gstin);
		return this;
	}
	
	public BookingDetailsPage enterCompanyName(String cname) {
		enterByXpath(prop.getProperty("IrctcBookingDetailsPage.EnterCompanyName.Xpath"), cname);
		return this;
	}
	
	public BookingDetailsPage enterCompanyAddress(String caddress) {
		enterByXpath(prop.getProperty("IrctcBookingDetailsPage.EnterCompanyAddress.Xpath"), caddress);
		return this;
	}
	
	public BookingDetailsPage switchingWindowForHotels() {
		switchToLastWindow();
		return this;
	}
	

}
