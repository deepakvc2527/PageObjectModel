package pom.facebook.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{

	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify Facebook registration for the new user sign up";
		author="Deepak";
		category="Smoke";
		url = "https://www.facebook.com";
	}
	
	@Test
	public void signUpFacebook() {
		
		new HomePage().clickOnCreateNewAccount()
		.enterFirstName("Deepak")
		.enterLastName("VC")
		.enterMobileNoOrEmail("vcdeepakcse@gmail.com")
		.enterConfirmEmail("vcdeepakcse@gmail.com")
		.enterNewPassword("deepakvc")
		.selectDate("25")
		.selectMonth("12")
		.selectYear("1989")
		.selectGender();
		
		
		
	}

}
