
package pom.panindia.pages;

import org.openqa.selenium.Keys;

import wrappers.GenericWrappers;

public class ApplyForNewPanPage extends GenericWrappers{
	
	public ApplyForNewPanPage selectTitle(String title) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectTitle.Xpath"), title);
		return this;
	}
	
	public ApplyForNewPanPage enterFirstName(String fname) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterFirstName.Xpath"), fname);
		return this;
	}
	
	public ApplyForNewPanPage enterMiddleName(String mname) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterMiddleName.Xpath"), mname);
		return this;
	}
	
	public ApplyForNewPanPage enterLastName(String lname) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterLastName.Xpath"), lname);
		return this;
	}
	
	public ApplyForNewPanPage enterFatherFirstName(String ffname) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterFatherFirstName.Xpath"), ffname);
		return this;
	}
	
	public ApplyForNewPanPage enterFatherMiddleName(String fmname) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterFatherMiddleName.Xpath"), fmname);
		return this;
	}
	
	public ApplyForNewPanPage enterFatherLastName(String flname) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterFatherLastName.Xpath"), flname);	
		return this;
	}
	
	public ApplyForNewPanPage enterMobileNumber(String mobile) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterMobileNumber.Xpath"), mobile);
		return this;
	}
	
	public ApplyForNewPanPage enterEmail(String email) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterEmail.Xpath"), email);
		return this;
	}
	
	public ApplyForNewPanPage selectIncomeSource(String income) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectIncomeSource.Xpath"), income);
		return this;
	}
	
	public ApplyForNewPanPage selectCommunication() {
		clickByXpath(prop.getProperty("PanRegistrationPage.SelectCommunication.Xpath"));
		return this;
	}
	
	public ApplyForNewPanPage enterDateOfBirth(String dob) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterDateOfBirth.Xpath"), dob);
		return this;
	}
	
	public ApplyForNewPanPage enterResidenceAddressNum(String resadd) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterResidenceAddressNum.Xpath"), resadd);
		return this;
	}
	
	public ApplyForNewPanPage enterResidenceStreet(String resstreet) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterResidenceStreet.Xpath"), resstreet);
		return this;
	}
	
	public ApplyForNewPanPage enterResidenceCity(String rescity) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterResidenceCity.Xpath"), rescity);
		return this;
	}
	
	public ApplyForNewPanPage selectState(String state) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectState.Xpath"), state);
		return this;
	}
	
	public ApplyForNewPanPage enterResidencePincode(String pcode) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterResidencePincode.Xpath"), pcode);
		return this;
	}
	
	public ApplyForNewPanPage selectCountry(String country) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectCountry.Xpath"), country);
		return this;
	}
	
	public ApplyForNewPanPage enterOfficeName(String offname) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterOfficeName.Xpath"), offname);
		return this;
	}
	
	public ApplyForNewPanPage enterOfficeAddress(String offadd) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterOfficeAddress.Xpath"), offadd);
		return this;
	}
	
	public ApplyForNewPanPage enterOfficeStreet(String offstreet) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterOfficeStreet.Xpath"), offstreet);
		return this;
	}
	
	public ApplyForNewPanPage enterOfficeCity(String offcity) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterOfficeCity.Xpath"), offcity);
		return this;
	}
	
	public ApplyForNewPanPage selectOfficeState(String offstate) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectOfficeState.Xpath"), offstate);
		return this;
	}
	
	public ApplyForNewPanPage enterOfficePincode(String offpin) {
		enterByXpath(prop.getProperty("PanRegistrationPage.EnterOfficePincode.Xpath"), offpin);
		return this;
	}
	
	public ApplyForNewPanPage selectOfficeCountry(String offcountry) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectOfficeCountry.Xpath"), offcountry);
		return this;
	}
	
	public ApplyForNewPanPage selectIdentityProof(String idproof) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectIdentityProof.Xpath"), idproof);
		return this;
	}
	
	public ApplyForNewPanPage selectAddressProof(String addproof) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectAddressProof.Xpath"), addproof);
		return this;
	}
	
	public ApplyForNewPanPage selectDobProof(String dobproof) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectDobProof.Xpath"), dobproof);
		return this;
	}
	
	public ApplyForNewPanPage selectAadhaarProof(String aadhaarproof) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectAadhaarProof.Xpath"), aadhaarproof);
		return this;
	}
	
	public ApplyForNewPanPage selectOffAddressProof(String offaddproof) {
		selectVisibleTextByXpath(prop.getProperty("PanRegistrationPage.SelectOffAddressProof.Xpath"), offaddproof);
		return this;
	}
	
	public ApplyForNewPanPage clickOnTermsAndConditions() {
		clickByXpath(prop.getProperty("PanRegistrationPage.ClickOnTermsAndConditions.Xpath"));
		return this;
	}
	
	public ApplyForNewPanPage pageDownForPanPage() {
		enterByXpathKeys("//html/body", Keys.PAGE_DOWN);
		return this;
	}
	

}
