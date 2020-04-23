package com.picsart.signup;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.picsart.base.BaseTest;
import com.picsart.pages.home.PicsartHomePage;
import com.picsart.pages.regaccount.RegisteredAccountPage;
import com.picsart.pages.signup.SignUpPage;

public class SignUpTest extends BaseTest {
	
	public String correctEmail="correct@gmail.com";
	public String correctPassword = "kkk";
	public static final int random = ThreadLocalRandom.current().nextInt(1000, 90000);

	@Test  (priority=0)
	// Test Case ID:1 Register in Picsart.com
	public void registerPicsart() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		// wait for Sign Up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Validate that Sign Up page is opened
		Assert.assertTrue(signPage.verifySignUpPageIsDisplayed());
		// Step 5:Enter email address in "Email" field
		signPage.emailSendKeys(correctEmail);
		// Step 6:Enter password in "Password" field
		signPage.passwordSendKeys(correctPassword);
		// Step 7:Click on Sign Up button
		signPage.clickOnSignUp();
		RegisteredAccountPage regUser = new RegisteredAccountPage(driver);
		// wait for registered account page to be opened
		regUser.waitForUserLogo();
		// Step 8:Validate that user is logged in
		Assert.assertTrue(regUser.validateLoggedInUser());
		regUser.clickOnUserLogo();
		regUser.waitForLogOutLink();
		regUser.clickOnLogOutLink();
	}

	@Test  (priority=1)
	// Test Case ID:2 Register with invalid email address
	public void registerInvalidEmail() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		// wait for Sign Up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Enter invalid email address in "Email" field
		signPage.emailSendKeys("#$%kll@mail.com");
		// Step 5:Enter password in "Password" field
		signPage.passwordSendKeys(correctPassword);
		// Step 6:Click on Sign Up button
		signPage.clickOnSignUp();
		// wait for email format error message to be displayed
		signPage.waitForEmailFormatError();
		// Step 7:Validate email format error message
		Assert.assertTrue(signPage.validateEmailFormaterrorMsg());

	}

	@Test (priority=2)
	// Test Case ID:3 Register with empty password
	public void registerEmptyPassword(){
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Sign up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Enter email address in "Email" field
		signPage.emailSendKeys(correctEmail);
		// Step 5:Leave "Password" field blank
		//wait for Sign up button to be clickable
		signPage.waitForSignUpClick();
		// Step 6:Click on "Sign up" button
		signPage.clickOnSignUp();
		// wait for password error message to be displayed
		signPage.waitForFillInPasswordError();
		// Step 7:Validate "Fill in password" error message
		Assert.assertTrue(signPage.validateFillInPasswordError());
	}

	@Test (priority=3)
	// Test Case ID:5 Register with existing parametres
	public void registerWithExistingParametres() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Sign up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Enter registered email address in "Email" field
		signPage.emailSendKeys(correctEmail);
		// Step 5:Enter registered password in "Password" field
		signPage.passwordSendKeys(correctPassword);
		// Step 6:Click on "Sign up" button
		signPage.clickOnSignUp();
		// "You are already registered" message should be displayed
		// "You are already registered" message is not displayed and user is logged in
		RegisteredAccountPage regUser = new RegisteredAccountPage(driver);
		regUser.waitForUserLogo();
		Assert.assertFalse(regUser.loggedInUserFalse());
		regUser.clickOnUserLogo();
		regUser.waitForLogOutLink();
		regUser.clickOnLogOutLink();
	}

	@Test (priority=4)
	// Test Case ID:7 Register with Valid Email address and less than 6 characters
	// password
	public void registerWithShortPassword() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Sign up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Enter email in "Email" field
		signPage.emailSendKeys(correctEmail);
		// Step 5:Enter less than 6 digit password in "Password"Field
		signPage.passwordSendKeys("" + random);
		// Step 6:Click on "Sign up" button
		signPage.clickOnSignUp();
		// wait for "Password is too short" error message
		signPage.waitForShortPasswordError();
		// Step 7:Validate short password
		Assert.assertTrue(signPage.validateShortPasswordErrorMsg());
	}

	@Test (priority=5)
	// Test Case ID:8 Register with an empty fields
	public void registerWithEmptyFields() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Sign up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Leave "Email" field blank
		// Step 5:Leave "Password" field blank
		// Step 6:Click on "Sign up" button
		signPage.clickOnSignUp();
		// wait for "Fill in email" message
		signPage.waitForFillInEmailError();
		// wait for "Fill in password" message
		signPage.waitForFillInPasswordError();
		// Step 7:Validate email error message
		Assert.assertTrue(signPage.validateFillInEmailError());
		// Step 8:Validate password error message
		Assert.assertTrue(signPage.validateFillInPasswordError());
	}

	@Test (priority=6)
	// Test Case ID:9 Register with empty Email address
	public void registerWithEmptyEmail() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Sign up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Leave "Email" field blank
		// Step 5:Enter valid password in "Password" field
		signPage.passwordSendKeys("" + random);
		// Step 6:Click on "Sign up" button
		signPage.clickOnSignUp();
		// wait for "Fill in email" message
		signPage.waitForFillInEmailError();
		// Step 7:Validate email error message
		Assert.assertTrue(signPage.validateFillInEmailError());
	}

	@Test (priority=7)
	// Test Case ID:11 Register with Valid Email address and more than 20 characters
	// password
	public void registerWithLongPassword() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Sign up button to be clickable
		homePage.waitForSignUpBtnToBeClickable();
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// Step 4:Enter valid email address in "Email"field
		signPage.emailSendKeys("xx@gmail.com");
		// Step 5:Enter more than 20 character password
		signPage.passwordSendKeys("fhy654sepo098ihkg67cf");
		// Step 6:Click on "Sign up" button
		signPage.clickOnSignUp();
		// wait for password error message
		signPage.waitForPasswordFormatError();
		// Step 7: Validate password format error
		Assert.assertTrue(signPage.validatePasswordFormatError());
	}

}
