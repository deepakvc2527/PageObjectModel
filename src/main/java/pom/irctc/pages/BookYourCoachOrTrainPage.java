package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookYourCoachOrTrainPage extends GenericWrappers{
	
	public FtrNewUserSignUpPage clickOnNewUserSignUp() {
		clickByXpath(prop.getProperty("IrctcBookYourCoachOrTrainPage.ClickOnNewUserSignUp.Xpath"));
		return new FtrNewUserSignUpPage();
	}
	
	public BookYourCoachOrTrainPage switchingWindowForBookYourCoach(){
		switchToLastWindow();
		return this;
	}
	


}
