package pom.irctc.pages;

import org.openqa.selenium.Keys;

import wrappers.GenericWrappers;

public class FtrNewUserSignUpPage extends GenericWrappers {
	
	
	public FtrNewUserSignUpPage enterUserId(String userid) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.UserId.Xpath"), userid); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterPassword(String password) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.Password.Xpath"), password); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterCnfrmPassword(String cnfpassword) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.ConfirmPassword.Xpath"), cnfpassword); 
		return this;
	}
	
	public FtrNewUserSignUpPage selectSecQues(String secques) {
		selectValueByXpath(prop.getProperty("FtrNewUserSignUpPage.SecurityQuestion.Xpath"), secques);
		return this;
	}
	
	public FtrNewUserSignUpPage enterSecurityAns(String secans) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.SecurityAnswer.Xpath"), secans); 
		return this;
	}
	
	public FtrNewUserSignUpPage clickOnDobBox() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.DobBox.Xpath"));
		return this;
	}
	
	public FtrNewUserSignUpPage selectMonth(String month) {
		selectValueByXpath(prop.getProperty("FtrNewUserSignUpPage.Month.Xpath"), month);
		return this;
	}
	
	public FtrNewUserSignUpPage selectYear(String year) {
		selectValueByXpath(prop.getProperty("FtrNewUserSignUpPage.Year.Xpath"), year);
		return this;
	}
	
	public FtrNewUserSignUpPage clickOnDob() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.Date.Xpath"));
		return this;
	}
	
	public FtrNewUserSignUpPage clickOnGender() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.Gender.Xpath"));
		return this;
	}
	
	public FtrNewUserSignUpPage clickOnMaritalStatus() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.MaritalStatus.Xpath"));
		return this;
	}
	
	public FtrNewUserSignUpPage enterEmailId(String email) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.EmailId.Xpath"), email); 
		return this;
	}
	
	public FtrNewUserSignUpPage selectOccupation(String occ) {
		selectValueByXpath(prop.getProperty("FtrNewUserSignUpPage.Occupation.Xpath"), occ);
		return this;
	}
	
	public FtrNewUserSignUpPage enterFirstName(String fname) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.FirstName.Xpath"), fname); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterMiddleName(String mname) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.MiddleName.Xpath"), mname); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterLastName(String lname) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.LastName.Xpath"), lname); 
		return this;
	}
	
	public FtrNewUserSignUpPage selectNationality(String nation) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.Nationality.Xpath"), nation);
		return this;
	}
	
	public FtrNewUserSignUpPage enterFlatNo(String flatno) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.FlatNo.Xpath"), flatno); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterStreet(String street) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.Street.Xpath"), street); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterArea(String area) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.Area.Xpath"), area); 
		return this;
	}
	
	public FtrNewUserSignUpPage selectCountry(String country) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.Country.Xpath"), country);
		return this;
	}
	
	public FtrNewUserSignUpPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.Mobile.Xpath"), mobile); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterPincode(String pincode) {
		enterByXpathTxtKeys(prop.getProperty("FtrNewUserSignUpPage.Pincode.Xpath"), pincode, Keys.TAB);
		return this;
	}
	
	public FtrNewUserSignUpPage selectCity(String city) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.City.Xpath"), city);
		return this;
	}
	
	public FtrNewUserSignUpPage selectState(String state) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.State.Xpath"), state);
		return this;
	}
	
	public FtrNewUserSignUpPage selectPostOffice(String po) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.PostOffice.Xpath"), po);
		return this;
	}
	
	public FtrNewUserSignUpPage clickOnNo() {
		clickByXpath(prop.getProperty("FtrNewUserSignUpPage.ClickNo.Xpath"));
		return this;
	}
	
	public FtrNewUserSignUpPage enterFlatNoOff(String flatnooff) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OffFlatNo.Xpath"), flatnooff); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterStreetOff(String streetoff) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OffStreet.Xpath"), streetoff); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterAreaOff(String areaoff) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OffArea.Xpath"), areaoff); 
		return this;
	}
	
	public FtrNewUserSignUpPage selectCountryOff(String countryoff) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.OffCountry.Xpath"), countryoff);
		return this;
	}
	
	public FtrNewUserSignUpPage enterMobileOff(String mobileoff) {
		enterByXpath(prop.getProperty("FtrNewUserSignUpPage.OffMobile.Xpath"), mobileoff); 
		return this;
	}
	
	public FtrNewUserSignUpPage enterPincodeOff(String pincodeoff) {
		enterByXpathTxtKeys(prop.getProperty("FtrNewUserSignUpPage.OffPincode.Xpath"), pincodeoff, Keys.TAB); 
		return this;
	}
	
	public FtrNewUserSignUpPage selectCityOff(String cityoff) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.OffCity.Xpath"), cityoff);
		return this;
	}
	
	public FtrNewUserSignUpPage selectStateOff(String stateoff) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.OffState.Xpath"), stateoff);
		return this;
	}
	
	public FtrNewUserSignUpPage selectPostOfficeOff(String pooff) {
		selectVisibleTextByXpath(prop.getProperty("FtrNewUserSignUpPage.OffPO.Xpath"), pooff);
		return this;
	}
	
	public FtrNewUserSignUpPage waitforFtrSignUp() {
		waitProperty(5000);
		return this;
	}
	
	public FtrNewUserSignUpPage pageDown() {
		enterByXpathKeys(prop.getProperty("FtrNewUserSignUpPage.PageDown.Xpath"), Keys.PAGE_DOWN);
		return this;
	}
	

}
