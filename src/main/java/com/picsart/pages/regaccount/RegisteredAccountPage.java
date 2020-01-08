package com.picsart.pages.regaccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class RegisteredAccountPage extends PicsartHomePage {

	public RegisteredAccountPage(WebDriver driver) {
		super(driver);
	}

	private PicsartBasePageObject wait = new PicsartBasePageObject(driver);

	public final String USER_LOGO = "//span[@class='c-ga-click circle-border']/*";
	public final String LOGOUT_LINK = "//a[contains(@href,'logout')]";

	@FindBy(xpath = USER_LOGO)
	WebElement userLogo;

	@FindBy(xpath = LOGOUT_LINK)
	WebElement logoutLink;

	public RegisteredAccountPage clickOnUserLogo() {
		userLogo.click();
		return new RegisteredAccountPage(driver);
	}

	public boolean validateLoggedInUser() {
		if (userLogo.isDisplayed()) {
			System.out.println("User is logged in");

			return true;
		} else
			return false;
	}

	public void waitForUserLogo() {
		wait.waitForElementToBeClickable(userLogo);
	}
	
	public boolean loggedInUserFalse() {
		if (userLogo.isDisplayed()) {
			System.out.println("Logged in page shouldn't open");
			return false;
		}
		else 
			return true;
	}
	
	public void waitForLogOutLink() {
		wait.waitForElementToBeClickable(logoutLink);
	}
	
	public void clickOnLogOutLink() {
		logoutLink.click();
	}

}
