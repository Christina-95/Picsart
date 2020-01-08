package com.picsart.pages.home.header.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class EditingToolsPage extends PicsartHomePage{

	public EditingToolsPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String CHANGE_BACKGROUND_LINK = "//h4[contains(text(),'Change Background')]";
	
	@FindBy (xpath = CHANGE_BACKGROUND_LINK)
	WebElement change_Background_Link;

	public boolean changeBackgroundLinkValidation() {
		if (change_Background_Link.isDisplayed()) {
			System.out.println("Change Background is displayed");
			return true;
		}
		else return false;	
	}
	
	public void waitForChangeBackgroundLink() {
		wait.waitForElementToBeClickable(change_Background_Link);
	}
}
