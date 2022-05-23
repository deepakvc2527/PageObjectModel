package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
   @BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC002";
		testCaseDescription = "To Book a coach";
		author = "Deepak";
		category="Smoke";
		url = "https://www.irctc.co.in/nget/train-search";
	}
	
   @Test
	public void irctcBookYourCoach() {
		
	
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.mouseHoverOnLounge()
		.clickOnLounge()
		.switchingWindowforAccomodation()
		.clickOnOptions()
		.clickOnBookYourCoach()
		.switchingWindowForBookYourCoach()
		.clickOnNewUserSignUp()
		.enterUserId("deepakvc")
		.enterPassword("Deepakvc25")
		.enterCnfrmPassword("Deepakvc25")
		.selectSecQues("4")
		.enterSecurityAns("CSK")
		.clickOnDobBox()
		.selectMonth("11")
		.selectYear("1990")
		.clickOnDob()
		.clickOnGender()
		.clickOnMaritalStatus()
		.enterEmailId("deepakvc.tech@gmail.com")
		.selectOccupation("Professional")
		.enterFirstName("Deepak")
		.enterMiddleName("V")
		.enterLastName("C")
		.selectNationality("Indian")
		.enterFlatNo("32")
		.enterStreet("Northstreet")
		.enterArea("Needa")
		.selectCountry("India")
		.enterMobile("8870420717")
		.enterPincode("600097")
		.selectCity("Kanchipuram")
		.selectState("TAMIL NADU")
		.selectPostOffice("Karapakkam S.O")
		.pageDown()
		.waitforFtrSignUp()
		.clickOnNo()
		.enterFlatNoOff("162")
		.enterStreetOff("MCN Nagar")
		.enterAreaOff("Thuraipakkam")
		.selectCountryOff("India")
		.enterMobileOff("8870420717")
		.enterPincodeOff("600097")
		.selectCityOff("Kanchipuram")
		.selectStateOff("TAMIL NADU")
		.selectPostOfficeOff("Karapakkam S.O");
		
	}

}
