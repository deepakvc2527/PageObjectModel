package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	public RegistrationPage enterUSerName(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.UserName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterUserPwd(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.UserPassword.Xpath"), data);
		return this;
	}

	public RegistrationPage enterCnfPwd(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.UserConfirmPassword.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickPrefLang() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickPrefLang.Xpath"));
		return this;
	}
	
	public RegistrationPage selectPrefLang() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.PrefLang.Xpath"));
		return this;
	}
	
	public RegistrationPage clickSecurityQuestion() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickSecurityQues.Xpath"));
		return this;
	}
	
	public RegistrationPage selectSecQues() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.SecurityQuestion.Xpath"));
		return this;
	}
	
	public RegistrationPage enterSecAns(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.SecurityAnswer.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickOnContinue() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.Continue.Xpath"));
		return this;
	}
	
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.FirstName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.MiddleName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.LastName.Xpath"), data);
		return this;
	}
	
	public RegistrationPage clickSelOcc() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickOcc.Xpath"));
		return this;
	}
	
	public RegistrationPage selectOcc() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.Occupation.Xpath"));
		return this;
	}
	
	public RegistrationPage clickDob() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ClickDob.Xpath"));
		return this;
	}
	
	public RegistrationPage selectMonth(String month) {
		selectValueByXpath(prop.getProperty("IrctcRegistrationPage.Month.Xpath"), month);
		return this;
	}
	
	public RegistrationPage selectYear(String year) {
		selectValueByXpath(prop.getProperty("IrctcRegistrationPage.Year.Xpath"), year);
		return this;
	}
	
	public RegistrationPage clickOnDate() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.Date.Xpath"));
		return this;
	}
	
	
	public RegistrationPage clickOnMaritalStatus() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.MaritalStatus.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnCountry(String country) {
		selectVisibleTextByXpath(prop.getProperty("IrctcRegistrationPage.Country.Xpath"), country);
		return this;
	}
		
	public RegistrationPage clickOnGender() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.Gender.Xpath"));
		return this;
	}
	
	public RegistrationPage enterEmail(String email) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Email.Xpath"), email);
		return this;
	}	
	
	public RegistrationPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Mobile.Xpath"), mobile);
		return this;
	}
	
	public RegistrationPage selectNationality(String nationality) {
		selectVisibleTextByXpath(prop.getProperty("IrctcRegistrationPage.Nationality.Xpath"), nationality);
		return this;
	}
	
	public RegistrationPage clickOnContinueTwo() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.ContinueTwo.Xpath"));
		return this;
	}
	
	public RegistrationPage enterFlatNo(String flatno) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.FlatNo.Xpath"), flatno);
		return this;
	}
	
	public RegistrationPage enterStreet(String street) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Street.Xpath"), street);
		return this;
	}
	
	public RegistrationPage enterArea(String area) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Area.Xpath"), area);
		return this;
	}
	
	public RegistrationPage enterPincode(String pincode) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.Pincode.Xpath"), pincode);
		return this;
	}
	
	public RegistrationPage enterState(String state) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.State.Xpath"), state);
		return this;
	}
	
	public RegistrationPage selectCity(String city) {
		selectVisibleTextByXpath(prop.getProperty("IrctcRegistrationPage.City.Xpath"), city);
		return this;
	}
	
	
	public RegistrationPage selectPostOffice(String po) {
		selectVisibleTextByXpath(prop.getProperty("IrctcRegistrationPage.PostOffice.Xpath"), po);
		return this;
	}
	
	public RegistrationPage enterResPhone(String resphone) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.ResPhone.Xpath"), resphone);
		return this;
	}
	
	public RegistrationPage clickOnCopResidence() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.CopyResidence.Xpath"));
		return this;
	}
	
	public RegistrationPage enterOffFlatNo(String offflatno) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OffFlatNo.Xpath"), offflatno);
		return this;
	}
	
	public RegistrationPage enterOffStreet(String offstreet) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OffStreet.Xpath"), offstreet);
		return this;
	}
	
	public RegistrationPage enterOffArea(String offarea) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OffArea.Xpath"), offarea);
		return this;
	}
	
	public RegistrationPage clickOnOffCountryBox() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.OffCountryBox.Xpath"));
		return this;
	}
	
	public RegistrationPage clickOnOffCountry() {
		clickByXpath(prop.getProperty("IrctcRegistrationPage.OffCountry.Xpath"));
		return this;
	}
	
	public RegistrationPage enterOffPincode(String offpin) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OffPincode.Xpath"), offpin);
		return this;
	}
	
	public RegistrationPage enterOffState(String offstate) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OffState.Xpath"), offstate);
		return this;
	}
	
	public RegistrationPage selectOffCity(String offcity) {
		selectVisibleTextByXpath(prop.getProperty("IrctcRegistrationPage.OffCity.Xpath"), offcity);
		return this;
	}
	
	public RegistrationPage selectOffPostOffice(String offpo) {
		selectVisibleTextByXpath(prop.getProperty("IrctcRegistrationPage.OffPostOffice.Xpath"), offpo);
		return this;
	}
	
	public RegistrationPage enterOffcity(String offcity) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.EnterOffCity.Xpath"), offcity);
		return this;
	}
	
	public RegistrationPage enterOffPo(String offpo) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.EnterOffPostOffice.Xpath"), offpo);
		return this;
	}
	
	public RegistrationPage enterOffPhone(String offphone) {
		enterByXpath(prop.getProperty("IrctcRegistrationPage.OffResPhone.Xpath"), offphone);
		return this;
	}
	
	
}
