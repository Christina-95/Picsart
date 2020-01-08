package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class EmojiPage extends PicsartHomePage {

	public EmojiPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String EMOJI = "//a[contains(text(),'Emoji') and @class='active-sub']";
	
	@FindBy (xpath = EMOJI)
	WebElement emojiLink;
	
	public boolean validateEmojiPage() {
		if (emojiLink.isDisplayed()) {
			System.out.println("Emoji link is valid and Stickers/Emoji page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForEmojiPage() {
		wait.waitForElementVisibility(emojiLink);
	}

}
