package com.picsart.pages.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;
import com.picsart.pages.login.LogInPage;

public class SignUpPage extends PicsartHomePage {

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	private PicsartBasePageObject wait = new PicsartBasePageObject(driver);

	public static final String EMAIL_INPUT = "//input[contains(@id,'email')]";
	public static final String PASSWORD_INPUT = "//input[contains(@id,'password')]";
	public static final String SIGN_UP_BTN = "//div[contains(text(),'Sign up')]";
	public static final String SIGN_UP_PAGE_CONTAINS_TEXT = "//div[@class='sign-up-form']";
	public static final String EMAIL_FORMAT_ERROR = "//span[@class='js-error error']/../span[1]";
	public static final String PASSWORD_FORMAT_ERROR = "//span[contains(text(),'Incorrect password format')]";
	public static final String FILL_IN_EMAIL_ERROR = "//span[contains(text(),'Please fill in username field')]";
	public static final String FILL_IN_PASSWORD_ERROR = "//span[contains(text(),'Please fill in password field')]";
	public static final String SHORT_PASSWORD_ERROR = "//span[contains(text(),'Password is too short')]";
	public static final String SIGN_IN_LINK = "//div[contains(text(),'Sign in')]";

	@FindBy(xpath = EMAIL_INPUT)
	WebElement emailField;

	@FindBy(xpath = PASSWORD_INPUT)
	WebElement passwordField;

	@FindBy(xpath = SIGN_UP_BTN)
	WebElement signupBtn;

	@FindBy(xpath = SIGN_UP_PAGE_CONTAINS_TEXT)
	WebElement signUpContainsText;

	@FindBy(xpath = EMAIL_FORMAT_ERROR)
	WebElement emailFormatError;

	@FindBy(xpath = PASSWORD_FORMAT_ERROR)
	WebElement passowordFormatError;

	@FindBy(xpath = FILL_IN_EMAIL_ERROR)
	WebElement fillInEmailError;

	@FindBy(xpath = FILL_IN_PASSWORD_ERROR)
	WebElement fillInPasswordError;

	@FindBy(xpath = SHORT_PASSWORD_ERROR)
	WebElement shortPasswordError;

	@FindBy(xpath = SIGN_IN_LINK)
	WebElement signInLink;

	public SignUpPage emailSendKeys(String email) {
		emailField.sendKeys(email);
		return new SignUpPage(driver);
	}

	public SignUpPage passwordSendKeys(String password) {
		passwordField.sendKeys(password);
		return new SignUpPage(driver);
	}
	
	public void waitForSignUpClick() {
		wait.waitForElementToBeClickable(signupBtn);
	}

	public SignUpPage clickOnSignUp() {
		signupBtn.click();
		return new SignUpPage(driver);
	}

	public void waitForSignUpPageToBeOpened() {
		wait.waitForElementVisibility(signUpContainsText);
	}

	public boolean verifySignUpPageIsDisplayed() {
		if (signUpContainsText.isDisplayed()) {
			System.out.println("Sign Up page is displayed");
			return true;
		} else
			return false;
	}

	public void waitForEmailFormatError() {
		wait.waitForElementVisibility(emailFormatError);
	}

	public boolean validateEmailFormaterrorMsg() {
		if (emailFormatError.isDisplayed()) {
			System.out.println("Error format msg is displayed");
			return true;
		} else
			return false;
	}

	public void waitForShortPasswordError() {
		wait.waitForElementVisibility(shortPasswordError);
	}

	public boolean validateShortPasswordErrorMsg() {
		if (shortPasswordError.isDisplayed()) {
			System.out.println("Password is too short");
			return true;
		} else
			return false;
	}

	public void waitForFillInEmailError() {
		wait.waitForElementVisibility(fillInEmailError);
	}

	public boolean validateFillInEmailError() {
		if (fillInEmailError.isDisplayed()) {
			System.out.println("Fill in Email");
			return true;
		} else
			return false;
	}

	public void waitForFillInPasswordError() {
		wait.waitForElementVisibility(fillInPasswordError);
	}

	public boolean validateFillInPasswordError() {
		if (fillInPasswordError.isDisplayed()) {
			System.out.println("Fill in password");
			return true;
		} else
			return false;
	}

	public void waitForPasswordFormatError() {
		wait.waitForElementVisibility(passowordFormatError);
	}

	public boolean validatePasswordFormatError() {
		if (passowordFormatError.isDisplayed()) {
			System.out.println("Password format error");
			return true;
		} else
			return false;
	}

	public void waitForSignInLink() {
		wait.waitForElementToBeClickable(signInLink);
	}

	public LogInPage clickOnSignInLink() {
		signInLink.click();
		return new LogInPage(driver);
	}

}
