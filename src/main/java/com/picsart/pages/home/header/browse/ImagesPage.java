package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class ImagesPage extends PicsartHomePage {

	public ImagesPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String IMAGES_LINK = "//a[contains(text(),'images') and @class='active-sub']";
	
	@FindBy (xpath = IMAGES_LINK)
	WebElement images_Link;
	
	public boolean validateImagesPage() {
		if (images_Link.isDisplayed()) {
			System.out.println("All Images link is valid and Images page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForImagesPage() {
		wait.waitForElementVisibility(images_Link);
	}

}
