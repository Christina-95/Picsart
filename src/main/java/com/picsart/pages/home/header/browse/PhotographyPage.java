package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class PhotographyPage  extends PicsartHomePage {

	public PhotographyPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String IMAGES_PHOTOGRAPHY_LINK = "//a[contains(text(),'Photography') and @class='active-sub']";
	
	@FindBy (xpath = IMAGES_PHOTOGRAPHY_LINK)
	WebElement photography_Link;
	
	public boolean validateImagesPhotographyPage() {
		if (photography_Link.isDisplayed()) {
			System.out.println("Photography link is valid and Images/Photography page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForImagesPhotographyPage() {
		wait.waitForElementVisibility(photography_Link);
	}

}
