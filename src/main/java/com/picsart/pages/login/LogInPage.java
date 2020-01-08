package com.picsart.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class LogInPage extends PicsartHomePage {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	PicsartBasePageObject wait = new PicsartBasePageObject(driver);

	public final String SIGN_IN_FORM = "//div[@class=' sign-in-form']/h2";
	public final String USER_NAME_FIELD = "//input[contains(@id,'username')]";
	public final String PASSWORD_FIELD = "//input[contains(@id,'password')]";
	public final String SIGN_IN_BTN = "//div[contains(text(),'Sign in')]";
	public final String INVALID_PASSWORD = "//span[contains(text(),'Invalid password')]";
	public final String INCORRECT_PASSWORD_OR_USERNAME = "";

	@FindBy(xpath = SIGN_IN_FORM)
	WebElement signInForm;

	@FindBy(xpath = USER_NAME_FIELD)
	WebElement userName;

	@FindBy(xpath = PASSWORD_FIELD)
	WebElement passwordField;

	@FindBy(xpath = SIGN_IN_BTN)
	WebElement signInBtn;

	@FindBy(xpath = INVALID_PASSWORD)
	WebElement invalidPassword;

	public void waitForSignInPage() {
		wait.waitForElementVisibility(signInForm);
	}

	public boolean validateSignInPageIsDisplayed() {
		if (signInForm.isDisplayed()) {
			System.out.println("Sign in page is opened");
			return true;
		} else
			return false;
	}

	public void waitForInvalidPasswordError() {
		wait.waitForElementVisibility(invalidPassword);
	}

	public boolean validateInvalidPassword() {
		if (invalidPassword.isDisplayed()) {
			System.out.println("Invalid Password message is displayed");
			return true;
		} else
			return false;
	}

	public LogInPage userNameSendKeys(String username) {
		userName.sendKeys(username);
		return new LogInPage(driver);
	}

	public LogInPage passwordSendKeys(String password) {
		passwordField.sendKeys(password);
		return new LogInPage(driver);
	}

	public LogInPage clickOnSignInBtn() {
		signInBtn.click();
		return new LogInPage(driver);
	}
}
