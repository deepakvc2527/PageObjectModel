package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterFirstName(String fname) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterFirstName.Xpath"), fname);
		return this;
	}
	
	public RegistrationPage enterLastName(String lname) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterLastName.Xpath"), lname);
		return this;
	}
	
	public RegistrationPage enterEmail(String email) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterEmail.Xpath"), email);
		return this;
	}
	
	public RegistrationPage enterPhoneNumber(String phone) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterPhoneNumber.Xpath"), phone);
		return this;
	}
	
	public RegistrationPage enterCompanyName(String cname) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterCompanyName.Xpath"), cname);
		return this;
	}
	
	public RegistrationPage enterStreetNumber(String snumber) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterStreetNumber.Xpath"), snumber);
		return this;
	}
	
	public RegistrationPage enterStreetName(String sname) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterStreetName.Xpath"), sname);
		return this;
	}
	
	public RegistrationPage enterCity(String city) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterCity.Xpath"), city);
		return this;
	}
	
	public RegistrationPage enterPostalCode(String pcode) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterPostalCode.Xpath"), pcode);
		return this;
	}
	
	public RegistrationPage selectCountry(String country) {
		selectVisibleTextByXpath(prop.getProperty("PhpTravelsRegistrationPage.SelectCountry.Xpath"), country);
		return this;
	}
	
	public RegistrationPage selectState(String state) {
		selectVisibleTextByXpath(prop.getProperty("PhpTravelsRegistrationPage.SelectState.Xpath"), state);
		return this;
	}
	
	public RegistrationPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterMobile.Xpath"), mobile);
		return this;
	}
	
	public RegistrationPage enterPassword(String pwd) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterPassword.Xpath"), pwd);
		return this;
	}
	
	public RegistrationPage enterConfirmPassword(String cnfpwd) {
		enterByXpath(prop.getProperty("PhpTravelsRegistrationPage.EnterConfirmPassword.Xpath"), cnfpwd);
		return this;
	}

}
