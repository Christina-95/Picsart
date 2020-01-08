package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class StickersAnimePage extends PicsartHomePage {

	public StickersAnimePage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String ANIME_STICKERS = "//a[contains(text(),'Anime') and @class='active-sub']";
	
	@FindBy (xpath = ANIME_STICKERS)
	WebElement anime_Stickers;
	
	public boolean validateStickersAnimePage() {
		if (anime_Stickers.isDisplayed()) {
			System.out.println("Anime link is valid and Stickers/Anime page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForStickersAnimePage() {
		wait.waitForElementVisibility(anime_Stickers);
	}
}
