package com.picsart.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.gold.GoldPage;
import com.picsart.pages.login.LogInPage;
import com.picsart.pages.signup.SignUpPage;

public class PicsartHomePage extends PicsartBasePageObject {

	public PicsartHomePage(WebDriver driver) {
		super(driver);
	}

	private PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	PicsartBasePageObject actions = new PicsartBasePageObject(driver);

	public static final String MAIN_SIGN_UP_BTN = "//a[contains(text(),'Sign Up')]";
	public static final String LOG_IN_BUTTON = "//a[contains(text(),'Log In')]";
	public static final String GOLD_BUTTON = "//span[contains(text(),'Gold')]";
	public static final String PRODUCT = "//span[contains(text(),'Product')]";
	public static final String BROWSE = "//span[contains(text(),'Browse')]";
	public static final String LEARN = "//span[contains(text(),'Learn')]";

	@FindBy(xpath = MAIN_SIGN_UP_BTN)
	WebElement mainSignUpBtn;
	
	@FindBy (xpath = LOG_IN_BUTTON)
	WebElement logInBtn;
	
	@FindBy (xpath = GOLD_BUTTON)
	WebElement goldButton;
	
	@FindBy (xpath = PRODUCT)
	WebElement product;
	
	@FindBy (xpath = BROWSE)
	WebElement browse;
	
	@FindBy (xpath = LEARN)
	WebElement learn;

	public SignUpPage signUpClick() {
		mainSignUpBtn.click();
		return new SignUpPage(driver);
	}
	
	public void waitForSignUpBtnToBeClickable() {
		wait.waitForElementToBeClickable(mainSignUpBtn);
		System.out.println("Sign up button is clickable");
	}
	
	public void waitForLogInBtnToBeClickable() {
		wait.waitForElementToBeClickable(logInBtn);
		System.out.println("Log In  buttonis displayed");
	}
	
	public LogInPage logInClick() {
		logInBtn.click();
		return new LogInPage(driver);
	}
	
	public GoldPage clickOnGoldBtn() {
		goldButton.click();
		return new GoldPage(driver);
	}
	
	public void waitForGoldBtnToBeClickable() {
		wait.waitForElementToBeClickable(goldButton);
		System.out.println("Gold button is clickable");
	}
	
	public void waitForProductVisibility() {
		wait.waitForElementVisibility(product);
	}
	
	public void waitForBrowseVisibility() {
		wait.waitForElementVisibility(browse);
	}
	
	public void waitForLearnVisibility() {
		wait.waitForElementVisibility(learn);
	}
	
	public void moveToProduct() {
		actions.moveToElement(product);
	}
	
	public void moveToBrowse() {
		actions.moveToElement(browse);
	}
	
	public void moveToLearn() {
		actions.moveToElement(learn);
	}
}
