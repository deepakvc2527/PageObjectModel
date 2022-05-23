package pom.panindia.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panindia.pages.ApplyForNewPanPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
@BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC009";
		testCaseDescription = "To fill Application form for new Pan card";
		author = "Deepak";
		category="Smoke";
		url = "https://www.panind.com/india/new_pan/";
	}

	@Test
	public void registerForPanIndia() {
		
		new ApplyForNewPanPage()
		.selectTitle("MR.")
		.enterFirstName("Deepak")
		.enterMiddleName("V")
		.enterLastName("C")
		.enterFatherFirstName("Chokalingam")
		.enterFatherMiddleName("V")
		.enterFatherLastName("V")
		.enterMobileNumber("8870420717")
		.enterEmail("deepak@gmail.com")
		.selectIncomeSource("Salary")
		.selectCommunication()
		.enterDateOfBirth("25121989")
		.enterResidenceAddressNum("32")
		.enterResidenceStreet("North Street")
		.enterResidenceCity("Chennai")
		.selectState("Tamil Nadu")
		.pageDownForPanPage()
		.enterResidencePincode("600097")
		.selectCountry("INDIA")
		.enterOfficeName("Akshaya")
		.enterOfficeAddress("162")
		.enterOfficeStreet("MCN Nagar")
		.enterOfficeCity("Chennai")
		.selectOfficeState("Tamil Nadu")
		.enterOfficePincode("600097")
		.selectOfficeCountry("INDIA")
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddressProof("PASSPORT (In Copy)")
		.selectDobProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAadhaarProof("Copy of Aadhaar Card / Letter")
		.selectOffAddressProof("Bank statement carrying Office Address")
		.pageDownForPanPage()
		.clickOnTermsAndConditions();
		
		
		
	}

}
