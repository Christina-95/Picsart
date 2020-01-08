package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class NaturePage extends PicsartHomePage {

	public NaturePage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String IMAGES_NATURE_LINK = "//a[contains(text(),'Nature') and @class='active-sub']";
	
	@FindBy (xpath = IMAGES_NATURE_LINK)
	WebElement nature_Link;
	
	public boolean validateImagesNaturePage() {
		if (nature_Link.isDisplayed()) {
			System.out.println("Nature link is valid and Images/Nature page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForImagesNaturePage() {
		wait.waitForElementVisibility(nature_Link);
	}

}
