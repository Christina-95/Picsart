package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class FashionPage extends PicsartHomePage {

	public FashionPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String IMAGES_FASHION_LINK = "//a[contains(text(),'Fashion') and @class='active-sub']";

	
	@FindBy (xpath = IMAGES_FASHION_LINK)
	WebElement fashion_Link;
	
	public boolean validateImagesFashionPage() {
		if (fashion_Link.isDisplayed()) {
			System.out.println("Fashion link is valid and Images/Fashion page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForImagesFashionPage() {
		wait.waitForElementVisibility(fashion_Link);
	}
}
