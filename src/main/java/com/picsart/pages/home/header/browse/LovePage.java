package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class LovePage extends PicsartHomePage {

	public LovePage(WebDriver driver) {
		super(driver);
	}
	
    PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String LOVE = "//a[contains(text(),'Love') and @class='active-sub']";
	
	@FindBy (xpath = LOVE)
	WebElement loveLink;
	
	public boolean validateLovePage() {
		if (loveLink.isDisplayed()) {
			System.out.println("Love link is valid and Stickers/Love page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForLovePage() {
		wait.waitForElementVisibility(loveLink);
	}

}
