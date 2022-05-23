package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testCaseName = "TC001";
		testCaseDescription = "To verify Irctc registration for the new user sign up";
		author = "Deepak";
		category="Smoke";
		url = "https://www.irctc.co.in/nget/train-search";
		sheetName ="TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void irctcRegistration(String username,String password,String cnfrmpwd, String lang, String secque, String secans,String firstname,String middlename,String lastname,String occ, String month,String year, String country, String email,String mobno,
			String nationality,String flatno,String street,String area,String pincode,String state,String city,String po,String phone,
			String offFlatno,String offStreet,String offArea,String offPincode,String offState,String offCity,String OffPostoff,String offPhone) {
		
		new CovidAlertPage()
		.clickOnOK()
		.clickOnRegister()
		.enterUSerName(username)
		.enterUserPwd(password)
		.enterCnfPwd(cnfrmpwd)
		.clickPrefLang()
		.selectPrefLang()
		.clickSecurityQuestion()
		.selectSecQues()
		.enterSecAns("SaravanaBhavan")
		.clickOnContinue()
		.enterFirstName("Deepak")
		.enterMiddleName("V")
		.enterLastName("C")
		.clickSelOcc()
		.selectOcc()
		.clickDob()
		.selectMonth("11")
		.selectYear("1990")
		.clickOnDate()
		.clickOnMaritalStatus()
		.clickOnCountry("India")
		.clickOnGender()
		.enterEmail("deepakvc.tech@gmail.com")
		.enterMobile("8870420717")
		.selectNationality("India")
		.clickOnContinueTwo()
		.enterFlatNo("32")
		.enterStreet("North street")
		.enterArea("Needa")
		.enterPincode("600097")
		.enterState("Tamilnadu")
		.selectCity("Kanchipuram")
		.selectPostOffice("Karapakkam S.O")
		.enterResPhone("8870420717")
		.clickOnCopResidence()
		.enterOffFlatNo("162")
		.enterOffStreet("MCN Nagar")
		.enterOffArea("Thuraipakkam")
		.clickOnOffCountryBox()
		.clickOnOffCountry()
		.enterOffPincode("600097")
		.enterOffState("Tamilnadu")
		//.selectOffCity("Kanchipuram")
		//.selectOffPostOffice("Karapakkam S.O")
		.enterOffcity("Kanchipuram")
		.enterOffPo("Karapakkam S.O")
		.enterOffPhone("8870420717");
		
		
		
	}

}
