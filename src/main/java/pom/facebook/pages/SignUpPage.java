package pom.facebook.pages;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers {
	
	public SignUpPage enterFirstName(String fname) {
		enterByXpath(prop.getProperty("FacebookSignupPage.FirstName.XPath"), fname);
		return this;
	}
	
	public SignUpPage enterLastName(String lname) {
		enterByXpath(prop.getProperty("FacebookSignupPage.LastName.XPath"), lname);
		return this;
	}
	
	public SignUpPage enterMobileNoOrEmail(String email) {
		enterByXpath(prop.getProperty("FacebookSignupPage.Email.Xpath"), email);
		return this;
	}
	
	public SignUpPage enterConfirmEmail(String conemail) {
		enterByXpath(prop.getProperty("FacebookSignupPage.ConfirmEmail.Xpath"), conemail);
		return this;
	}
	
	public SignUpPage enterNewPassword(String pwd) {
		enterByXpath(prop.getProperty("FacebookSignupPage.Password.Xpath"), pwd);
		return this;
	}
	
	public SignUpPage selectDate(String date) {
		selectValueByXpath(prop.getProperty("FacebookSignupPage.Date.Xpath"), date);
		return this;
	}
	
	public SignUpPage selectMonth(String month) {
		selectValueByXpath(prop.getProperty("FacebookSignupPage.Month.Xpath"), month);
		return this;
	}
	
	public SignUpPage selectYear(String year) {
		selectValueByXpath(prop.getProperty("FacebookSignupPage.Year.Xpath"), year);
		return this;
	}
	
	public SignUpPage selectGender() {
		clickByXpath(prop.getProperty("FacebookSignupPage.Gender.Xpath"));
		return this;
	}

}
