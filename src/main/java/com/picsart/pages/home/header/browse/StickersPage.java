package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class StickersPage extends PicsartHomePage {

	public StickersPage(WebDriver driver) {
		super(driver);
	}
	
PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String ALL_STICKERS = "//a[contains(text(),'stickers') and @class='active-sub']";
	
	@FindBy (xpath = ALL_STICKERS)
	WebElement allStickerLink;
	
	public boolean validateStickersPage() {
		if (allStickerLink.isDisplayed()) {
			System.out.println("All Stickers link is valid and Stickers page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForStickersPage() {
		wait.waitForElementVisibility(allStickerLink);
	}


}
