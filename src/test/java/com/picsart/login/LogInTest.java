package com.picsart.login;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.picsart.base.BaseTest;
import com.picsart.pages.home.PicsartHomePage;
import com.picsart.pages.login.LogInPage;
import com.picsart.pages.regaccount.RegisteredAccountPage;
import com.picsart.pages.signup.SignUpPage;

public class LogInTest extends BaseTest {
	public static final int random = ThreadLocalRandom.current().nextInt(100000, 900000000);

	@Test (priority=1)
	// Test Case ID:22 Login with existing parametres
	public void loginWithExistingParametres() throws InterruptedException {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// wait for "Sign in" link to be clickable
		signPage.waitForSignInLink();
		// Step 4:Click on "Sign in" link
		Thread.sleep(1000);
		LogInPage signInPage = signPage.clickOnSignInLink();
		// wait for "Sign in" page to be displayed
		signInPage.waitForSignInPage();
		// Step 5:Validate that Sign in page is displayed
		Assert.assertTrue(signInPage.validateSignInPageIsDisplayed());
		// Step 6:Enter registered email address in "Email" field
		signInPage.userNameSendKeys("XXX@gmail.com");
		// Step 7:Enter registered password in "Password" field
		signInPage.passwordSendKeys("bhbjkk");
		// Step 8:Click on "Sign up" button
		signInPage.clickOnSignInBtn();
		// wait for Registered user page to be opened
		RegisteredAccountPage loggedUser = new RegisteredAccountPage(driver);
		loggedUser.waitForUserLogo();
		// Step 9:Validate that user is logged in
		Assert.assertTrue(loggedUser.validateLoggedInUser());
	}

	@Test (priority=2)
	// Test Case ID:23 Login with existing email and incorrect password
	public void loginWithIncorrectPassword() throws InterruptedException {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		// Step 3:Click on "Sign Up" button
		SignUpPage signPage = homePage.signUpClick();
		// wait for Sign Up page to be opened
		signPage.waitForSignUpPageToBeOpened();
		// wait for "Sign in" link to be clickable
		signPage.waitForSignInLink();
		// Step 4:Click on "Sign in" link
		Thread.sleep(1000);
		LogInPage signInPage = signPage.clickOnSignInLink();
		// wait for "Sign in" page to be displayed
		signInPage.waitForSignInPage();
		// Step 5:Enter registered email address in "Email" field
		signInPage.userNameSendKeys("XXX@gmail.com");
		// Step 6:Enter incorrect password in "Password" field
		signInPage.passwordSendKeys("hkjjhlk789865");
		// Step 7:Click on "Sign up" button
		signInPage.clickOnSignInBtn();
		// wait for "Invalid password" message
		signInPage.waitForInvalidPasswordError();
		// Step 8:Validate "Invalid password" message
		Assert.assertTrue(signInPage.validateInvalidPassword());
	}
	
	@Test (priority=3)
	//Test Case ID:24 Login with not registered email address and password
	public void loginWithIncorrectEmail() {
		//Step 1:Open browser - done in @BaseTest
		//Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//Step 3:Click on "Sign up" button
		SignUpPage signPage = homePage.signUpClick();
		//wait for "Sign in" button to be clickable
		signPage.waitForSignInLink();
		//Step 4:Click on "Sign in" button
		LogInPage signInPage = signPage.clickOnSignInLink();
		//wait for Sign In Page to be displayed
		signInPage.waitForSignInPage();
		//Step 5:Enter incorrect email address in "Email" field
		signInPage.userNameSendKeys("xxx"+random+"@gmail.com");
		//Step 6:Enter random password in "Password" field
		signInPage.passwordSendKeys("" + random);
		//Step 7:Click on "Sign in" button
		signInPage.clickOnSignInBtn();
		//wait for error message
		
		//Step 8:Validate error message	
	}
	
	@Test (priority=4)
	//Test Case ID:25 Login with valid email and empty password
	public void loginWithEmptyPassword() {
		//Step 1:Open browser - done in @BaseTest
		//Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//Step 3:Click on "Sign up" button
		SignUpPage signPage = homePage.signUpClick();
		//wait for "Sign in" button to be clickable
		signPage.waitForSignInLink();
		//Step 4:Click on "Sign in" button
		LogInPage signInPage = signPage.clickOnSignInLink();
		//wait for Sign In page to be displayed
		signInPage.waitForSignInPage();
		//Step 5:Enter valid email addresss in "Email" field
		signInPage.userNameSendKeys("xxx@gmail.com");
		//Step 6:Leave password field blank
		signInPage.passwordSendKeys("");
		//Step 7:Click on "Sign in" button 
		signInPage.clickOnSignInBtn();
		//wait for error message
		
		//Step 8:Validate error message
		
	}
	
	@Test (priority=5)
	//Test Case ID:26 Login with empty email field and valid password
	public void loginWithEmptyEmail() {
		//Step 1:Open browser - done in @BaseTest
		//Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//Step 3:Click on "Sign up" button
		SignUpPage signPage = homePage.signUpClick();
		//wait for "Sign in" button to be clickable
		signPage.waitForSignInLink();
		//Step 4:Click on "Sign in" button
		LogInPage signInPage = signPage.clickOnSignInLink();
		//wait for Sign In page to be displayed
		signInPage.waitForSignInPage();
		//Step 5:Leave "Email" field blank
		signInPage.userNameSendKeys("");
		//Step 6:Enter valid password in "Password" field
		signInPage.passwordSendKeys("" + random);
		//Step 7:Click on "Sign in" button 
		signInPage.clickOnSignInBtn();
		//wait for error message
		//Step 8:Validate error message
		
	}
	
	@Test (priority=6)
	//Test Case ID:27 Login with empty fields
	public void loginWithEmptyFields() {
		//Step 1:Open browser - done in @BaseTest
		//Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//Step 3:Click on "Sign up" button
		SignUpPage signPage = homePage.signUpClick();
		//wait for "Sign in" button to be clickable
		signPage.waitForSignInLink();
		//Step 4:Click on "Sign in" button
		LogInPage signInPage = signPage.clickOnSignInLink();
		//wait for Sign In page to be displayed
		signInPage.waitForSignInPage();
		//Step 5:Leave "Email" field blank
		signInPage.userNameSendKeys("");
		//Step 6:Leave "Password" field blank
		signInPage.passwordSendKeys("");
		//Step 7:Click on "Sign in" button 
		signInPage.clickOnSignInBtn();
		//wait for error message
		//Step 8:Validate error message
	}
	
	//@Test (priority=7)
	//Test Case ID:28 Login with registered email and with "forget password"


}
