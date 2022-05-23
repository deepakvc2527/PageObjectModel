package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	   @BeforeClass
		
		public void beforeClass() {
			testCaseName = "TC003";
			testCaseDescription = "Request for Saloon Charter";
			author = "Deepak";
			category="Smoke";
			url = "https://www.irctc.co.in/nget/train-search";
		}
		
	@Test
	public void irctcCharter() {
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverOnLounge()
		.clickOnLounge()
		.switchingWindowforAccomodation()
		.clickOnOptions()
		.clickOnCharter()
		.clickOnEnquiryForm()
		.clickOnHideOptions()
		.enterNameOfApplicant("Deepak")
		.enterNameOfOrganisation("Liberty")
		.enterAddress("MCN Nagar")
		.enterMobileNo("8870420717")
		.enterEmailOfApplicant("deepakvc@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOriginStation("Trichy")
		.enterDestStation("Chennai")
		.clickOnDateOfDeparture()
		.selectCheckInYear("2022")
		.clickOnCheckInDate()
		.clickOnDateOfArrival()
		.clickOnNextMonth()
		.selectCheckOutYear("2022")
		.clickOnCheckOutDate()
		.enterDurationOfTour("3")
		.enterCoachDetails("S3")
		.enterNumberOfPassenger("5")
		.enterNoOfPassengers("5")
		.enterCharterPurpose("Saloon")
		.enterAdditionalService("Nothing");
		
		
		
		
		
		
		
		
	}

}
