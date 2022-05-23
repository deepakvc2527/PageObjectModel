package pom.irctc.pages;

import org.openqa.selenium.Keys;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage clickOnEnquiryForm() {
		 clickByXpath(prop.getProperty("IrctcCharterPage.ClickOnEnquiryForm.Xpath"));
		 return this;
	}
	
	public CharterPage clickOnHideOptions() {
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickOnHideOptions.Xpath"));
		return this;
	}
	
	public CharterPage enterNameOfApplicant(String name) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterNameOfApplicant.Xpath"), name);
		return this;
	}
	
	public CharterPage enterNameOfOrganisation(String org) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterNameOfOrganisation.Xpath"), org);
		return this;
	}
	
	public CharterPage enterAddress(String address) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterAddress.Xpath"), address);
		return this;
	}
	
	public CharterPage enterMobileNo(String mobile) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterMobileNo.Xpath"), mobile);
		return this;
	}
	
	public CharterPage enterEmailOfApplicant(String email) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterEmailOfApplicant.Xpath"), email);
		return this;
	}
	
	public CharterPage selectRequestFor(String reqfor) {
		selectValueByXpath(prop.getProperty("IrctcCharterPage.SelectRequestFor.Xpath"), reqfor);
		return this;
	}
	
	public CharterPage enterOriginStation(String originst) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterOriginStation.Xpath"), originst);
		return this;
	}
	
	public CharterPage enterDestStation(String destst) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterDestStation.Xpath"), destst);
		return this;
	}
	
	public CharterPage clickOnDateOfDeparture() {
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickOnDateOfDeparture.Xpath"));
		return this;
		 
	}
	
	public CharterPage selectCheckInYear(String inyear) {
		selectValueByXpath(prop.getProperty("IrctcCharterPage.SelectCheckInYear.Xpath"), inyear);
		return this;
	}
	
	public CharterPage clickOnCheckInDate() {
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickOnCheckInDate.Xpath"));
		return this;
	}
	
	public CharterPage clickOnDateOfArrival() {
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickOnDateOfArrival.Xpath"));
		return this;
		 
	}
	
	public CharterPage clickOnNextMonth() {
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickOnNextMonth.Xpath"));
		return this;
		
	}
	
	public CharterPage selectCheckOutYear(String outyear) {
		selectValueByXpath(prop.getProperty("IrctcCharterPage.SelectCheckOutYear.Xpath"), outyear);
		return this;
	}
	
	public CharterPage clickOnCheckOutDate() {
		clickByXpath(prop.getProperty("IrctcCharterPage.ClickOnCheckOutDate.Xpath"));
		return this;
	}
	
	public CharterPage enterDurationOfTour(String duration) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterDurationOfTour.Xpath"), duration);
		return this;
	}
	
	public CharterPage enterCoachDetails(String coachdet) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterCoachDetails.Xpath"), coachdet);
		return this;
	}
	
	public CharterPage enterNumberOfPassenger(String passenger) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterNumberOfPassenger.Xpath"), passenger);
		return this;
	}
	
	public CharterPage enterNoOfPassengers(String passengers) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterNoOfPassengers.Xpath"), passengers);
		return this;
	}
	
	public CharterPage enterCharterPurpose(String purpose) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterCharterPurpose.Xpath"), purpose);
		return this;
	}
	
	public CharterPage enterAdditionalService(String service) {
		enterByXpath(prop.getProperty("IrctcCharterPage.EnterAdditionalService.Xpath"), service);
		return this;
	}
	
	public CharterPage waitForCharterPage() {
		waitProperty(2000);
		return this;
	}
	
	public CharterPage pageDown() {
		enterByXpathKeys(prop.getProperty("IrctcCharterPage.PageDown.Xpath"), Keys.PAGE_DOWN);
		return this;
	}

}
