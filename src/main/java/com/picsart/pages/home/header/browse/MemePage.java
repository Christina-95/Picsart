package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class MemePage extends PicsartHomePage {

	public MemePage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String MEME = "//a[contains(text(),'Meme') and @class='active-sub']";
	
	@FindBy (xpath = MEME)
	WebElement memeLink;
	
	public boolean validateMemePage() {
		if (memeLink.isDisplayed()) {
			System.out.println("Meme link is valid and Stickers/Meme page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForMemePage() {
		wait.waitForElementVisibility(memeLink);
	}

}
