package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class EditingPage extends PicsartHomePage {

	public EditingPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String IMAGES_EDITING_LINK = "//a[contains(text(),'Editing') and @class='active-sub']";

	
	@FindBy (xpath = IMAGES_EDITING_LINK)
	WebElement editing_Link;
	
	public boolean validateImagesEditingPage() {
		if (editing_Link.isDisplayed()) {
			System.out.println("Editing link is valid and Images/Editing page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForImagesEditingPage() {
		wait.waitForElementVisibility(editing_Link);
	}
}
