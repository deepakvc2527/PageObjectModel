package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	   @BeforeClass
		
		public void beforeClass() {
			testCaseName = "TC006";
			testCaseDescription = "To verify user registration for Form C";
			author = "Deepak";
			category="Smoke";
			url = "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		}
		
	@Test
	public void signUpFormC() {
		
		
		new HomePage()
		.clickOnSignUp()
		.enterUserId("deepakvc25")
		.enterPassword("deepakvc")
		.enterConfirmPassword("deepakvc")
		.selectSecurityQuestion("5")
		.enterSecurityAnswer("Saravana bhavan")
		.enterName("Deepak")
		.selectGender("M")
		.enterDateOfBirth("25/12/1989")
		.enterDesignation("Tester")
		.enterEmailId("deepak@gmail.com")
		.enterMobile("8870420717")
		.enterPhoneNo("8870420717")
		.selectNationality("IND")
		.enterHouseName("Deepak")
		.enterHouseCapacity("25")
		.enterHouseAddress("Thuraipakkam")
		.selectHState("28")
		.waitForRegPage()
		.selectHCityDistrict("4C")
		.selectAccomodationType("O")
		.selectAccomodationGrade("5s")
		.enterHEmailId("deepak@gmail.com")
		.enterHMobile("786786868")
		.enterHPhoneNo("45353453536")
		.enterOwnerName("Deepak")
		.enterOwnerAddress("Thuraipakkam")
		.selectOwnerState("28")
		.waitForRegPage()
		.selectOwnerCity("4C")
		.enterOwnerEmailId("hehjefh@gmail.com")
		.enterOwnerPhoneNo("5345435980")
		.enterOwnerMobile("3453455548")
		.clickOnAdd()
		.enterOwnerName2("Akshaya")
		.enterOwnerAddress2("Thuraipakkam")
		.selectOwnerState2("28")
		.waitForRegPage()
		.selectOwnerCity2("4C")
		.enterOwnerEmailId2("hedsdsfh@gmail.com")
		.enterOwnerPhoneNo2("7657677567")
		.enterOwnerMobile2("7577888880")
		.clickOnAdd2()
		.enterOwnerName3("Ryan")
		.enterOwnerAddress3("Thuraipakkam")
		.selectOwnerState3("28")
		.waitForRegPage()
		.selectOwnerCity3("4C")
		.enterOwnerEmailId3("jefh@gmail.com")
		.enterOwnerPhoneNo3("9879797987")
		.enterOwnerMobile3("8796868666")
		.clickOnAdd3();
		
		
		
		
	}

}
