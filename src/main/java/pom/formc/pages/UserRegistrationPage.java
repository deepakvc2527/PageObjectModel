package pom.formc.pages;

import wrappers.GenericWrappers;

public class UserRegistrationPage extends GenericWrappers {
	
	public UserRegistrationPage enterUserId(String id) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.UserId.Xpath"), id);
		return this;
	}
	
	public UserRegistrationPage enterPassword(String pwd) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Password.Xpath"), pwd);
		return this;
	}
	
	public UserRegistrationPage enterConfirmPassword(String cnfpwd) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.ConfirmPassword.Xpath"), cnfpwd);
		return this;
	}
	
	public UserRegistrationPage selectSecurityQuestion(String secques) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.SecurityQuestion.Xpath"), secques);
		return this;
	}
	
	public UserRegistrationPage enterSecurityAnswer(String secans) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.SecurityAnswer.Xpath"), secans);
		return this;
	}
	
	public UserRegistrationPage enterName(String name) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Name.Xpath"), name);
		return this;
	}
	
	public UserRegistrationPage selectGender(String gender) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.Gender.Xpath"), gender);
		return this;
	}
	
	public UserRegistrationPage enterDateOfBirth(String dob) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Dob.Xpath"), dob);
		return this;
	}
	
	public UserRegistrationPage enterDesignation(String designation) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Designation.Xpath"), designation);
		return this;
	}
	
	public UserRegistrationPage enterEmailId(String email) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.EmailId.Xpath"), email);
		return this;
	}
	
	public UserRegistrationPage enterMobile(String mobile) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Mobile.Xpath"), mobile);
		return this;
	}
	
	public UserRegistrationPage enterPhoneNo(String phone) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Phone.Xpath"), phone);
		return this;
	}
	
	public UserRegistrationPage selectNationality(String nation) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.Nationality.Xpath"), nation);
		return this;
	}
	
	public UserRegistrationPage enterHouseName(String hname) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HouseName.Xpath"), hname);
		return this;
	}
	
	public UserRegistrationPage enterHouseCapacity(String hcapacity) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HouseCapacity.Xpath"), hcapacity);
		return this;
	}
	
	public UserRegistrationPage enterHouseAddress(String haddress) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.HouseAddress.Xpath"), haddress);
		return this;
	}
	
	public UserRegistrationPage selectHState(String hstate) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.HouseState.Xpath"), hstate);
		return this;
	}
	
	public UserRegistrationPage waitForRegPage() {
		waitProperty(2000);
		return this;
	}
	
	public UserRegistrationPage selectHCityDistrict(String hcity) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.HouseCity.Xpath"), hcity);
		return this;
	}
	
	public UserRegistrationPage selectAccomodationType(String accotype) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.AccType.Xpath"), accotype);
		return this;
	}
	
	public UserRegistrationPage selectAccomodationGrade(String accgrade) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.AccGrade.Xpath"), accgrade);
		return this;
	}
	
	public UserRegistrationPage enterHEmailId(String hemail) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.EmailId.Xpath"), hemail);
		return this;
	}
	
	public UserRegistrationPage enterHMobile(String hmobile) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Mobile.Xpath"), hmobile);
		return this;
	}
	
	public UserRegistrationPage enterHPhoneNo(String hphone) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.Phone.Xpath"), hphone);
		return this;
	}
	
	public UserRegistrationPage enterOwnerName(String oname) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerName.Xpath"), oname);
		return this;
	}
	
	public UserRegistrationPage enterOwnerAddress(String oaddr) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerAddress.Xpath"), oaddr);
		return this;
	}
	
	public UserRegistrationPage selectOwnerState(String ostate) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.OwnerState.Xpath"), ostate);
		return this;
	}
	
	public UserRegistrationPage selectOwnerCity(String ocity) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.OwnerCity.Xpath"), ocity);
		return this;
	}
	
	public UserRegistrationPage enterOwnerEmailId(String oemail) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerEmail.Xpath"), oemail);
		return this;
	}
	
	public UserRegistrationPage enterOwnerPhoneNo(String ophone) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerPhone.Xpath"), ophone);
		return this;
	}
	
	public UserRegistrationPage enterOwnerMobile(String omobile) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerMobile.Xpath"), omobile);
		return this;
	}
	
	public UserRegistrationPage clickOnAdd() {
		clickByXpath(prop.getProperty("FormCRegistrationPage.Add.Xpath"));
		return this;
	}
	
	public UserRegistrationPage enterOwnerName2(String oname2) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerName2.Xpath"), oname2);
		return this;
	}
	
	public UserRegistrationPage enterOwnerAddress2(String oaddr2) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerAddress2.Xpath"), oaddr2);
		return this;
	}
	
	public UserRegistrationPage selectOwnerState2(String ostate2) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.OwnerState2.Xpath"), ostate2);
		return this;
	}
	
	public UserRegistrationPage selectOwnerCity2(String ocity2) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.OwnerCity2.Xpath"), ocity2);
		return this;
	}
	
	public UserRegistrationPage enterOwnerEmailId2(String oemail2) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerEmail2.Xpath"), oemail2);
		return this;
	}
	
	public UserRegistrationPage enterOwnerPhoneNo2(String ophone2) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerPhone2.Xpath"), ophone2);
		return this;
	}
	
	public UserRegistrationPage enterOwnerMobile2(String omobile2) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerMobile2.Xpath"), omobile2);
		return this;
	}
	
	public UserRegistrationPage clickOnAdd2() {
		clickByXpath(prop.getProperty("FormCRegistrationPage.Add2.Xpath"));
		return this;
	}

	public UserRegistrationPage enterOwnerName3(String oname3) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerName3.Xpath"), oname3);
		return this;
	}
	
	public UserRegistrationPage enterOwnerAddress3(String oaddr3) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerAddress3.Xpath"), oaddr3);
		return this;
	}
	
	public UserRegistrationPage selectOwnerState3(String ostate3) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.OwnerState3.Xpath"), ostate3);
		return this;
	}
	
	public UserRegistrationPage selectOwnerCity3(String ocity3) {
		selectValueByXpath(prop.getProperty("FormCRegistrationPage.OwnerCity3.Xpath"), ocity3);
		return this;
	}
	
	public UserRegistrationPage enterOwnerEmailId3(String oemail3) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerEmail3.Xpath"), oemail3);
		return this;
	}
	
	public UserRegistrationPage enterOwnerPhoneNo3(String ophone3) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerPhone3.Xpath"), ophone3);
		return this;
	}
	
	public UserRegistrationPage enterOwnerMobile3(String omobile3) {
		enterByXpath(prop.getProperty("FormCRegistrationPage.OwnerMobile3.Xpath"), omobile3);
		return this;
	}
	
	public UserRegistrationPage clickOnAdd3() {
		clickByXpath(prop.getProperty("FormCRegistrationPage.Add3.Xpath"));
		return this;
	}


}
