package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class CelebritiesPage extends PicsartHomePage {

	public CelebritiesPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String CELEBRITIES= "//a[contains(text(),'Celebrities') and @class='active-sub']";
	
	@FindBy (xpath = CELEBRITIES)
	WebElement celebritiesLink;

	
	public boolean validateCelebritiesPage() {
		if (celebritiesLink.isDisplayed()) {
			System.out.println("Celebrities link is valid and Stickers/Celebrities page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForCelebritiesPage() {
		wait.waitForElementVisibility(celebritiesLink);
	}
}
