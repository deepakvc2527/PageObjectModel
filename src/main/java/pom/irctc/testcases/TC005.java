package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
@BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC005";
		testCaseDescription = "Book Hotel with GST";
		author = "Deepak";
		category="Smoke";
		url = "https://www.irctc.co.in";
	}
	
@Test
	
	public void irctcBookHotelWithGst() {
		
		new CovidAlertPage()
		.clickOnOK()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchingWindowforAccomodation()
		.clickOnHotels()
		.switchingWindowForHotels()
		.clickOnLoginButton()
		.clickOnGuestUser()
		.enterEmail("Deepak@gmail.com")
		.enterMobileNo("8870420717")
		.clickOnLogin()
		.waitForHotelsPage()
		.enterHotelCity("Chennai")
		.clickOnHotelCity()
		.clickFromDate()
		.waitForHotelsPage()
		.selectFromDate()
		.waitForHotelsPage()
		.clickToDate()
		.waitForHotelsPage()
		.clickOnNextMonth()
		.waitForHotelsPage()
		.selectToDate()
		.clickRoomsGuests()
		.selectNoOfRooms("1")
		.selectNoOfAdults("3")
		.clickOnDone()
		.clickFindHotel()
		.waitForHotelListPage()
		.selectHotel()
		.switchingWindowForHotels()
		.waitForBookHotelPage()
		.clickOnBookHotel()
		.selectTitle("Mr")
		.enterFirstName("Deepak")
		.enterLastName("VC")
		.selectCountry("India")
		.selectState("TAMIL NADU")
		.enterMobile("8870420717")
		.enterEmail("deepakvc@gmail.com")
		.selectGstYes("Yes")
		.enterGstin("979879879332ee")
		.enterCompanyName("Liberty")
		.enterCompanyAddress("Chennai");
		
		
		}

}
