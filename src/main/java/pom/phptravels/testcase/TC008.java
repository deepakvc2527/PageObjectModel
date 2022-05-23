package pom.phptravels.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
@BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC008";
		testCaseDescription = "PHP Travels";
		author = "Deepak";
		category="Smoke";
		url = "https://www.phptravels.org/register.php";
	}
	
	@Test
	public void registerPhpTravels() {
		
		new RegistrationPage()
		.enterFirstName("Deepak")
		.enterLastName("VC")
		.enterEmail("deepak@gmail.com")
		.enterPhoneNumber("8870420717")
		.enterCompanyName("Liberty")
		.enterStreetNumber("32")
		.enterStreetName("North Street")
		.enterCity("Chennai")
		.enterPostalCode("600097")
		.selectCountry("India")
		.selectState("Tamil Nadu")
		.enterMobile("8870420717")
		.enterPassword("deepakvc")
		.enterConfirmPassword("deepakvc");
		
		
		
	}

}
