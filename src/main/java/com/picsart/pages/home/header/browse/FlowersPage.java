package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class FlowersPage extends PicsartHomePage {

	public FlowersPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String IMAGES_FLOWERS_LINK = "//a[contains(text(),'Flowers') and @class='active-sub']";

	@FindBy (xpath = IMAGES_FLOWERS_LINK)
	WebElement flowers_Link;
	
	public boolean validateImagesFlowersPage() {
		if (flowers_Link.isDisplayed()) {
			System.out.println("Flowers link is valid and Images/Flowers page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForImagesFlowersPage() {
		wait.waitForElementVisibility(flowers_Link);
	}
}
