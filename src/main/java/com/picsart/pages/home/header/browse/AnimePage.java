package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class AnimePage extends PicsartHomePage {

	public AnimePage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String IMAGES_ANIME_LINK = "//a[contains(text(),'Anime') and @class='active-sub']";

	@FindBy (xpath = IMAGES_ANIME_LINK)
	WebElement anime_Link;
	
	public boolean validateImagesAnimePage() {
		if (anime_Link.isDisplayed()) {
			System.out.println("Anime link is valid and Images/Anime page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForImagesAnimePage() {
		wait.waitForElementVisibility(anime_Link);
	}
}
