package com.picsart.pages.home.header.product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class PhotoEditorPage extends PicsartHomePage {

	public PhotoEditorPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String PLAY_WITH_PHOTO_EDITOR_BTN = "//button[contains(text(),'Play With Photo Editor Now!')]";
	
	
	@FindBy (xpath = PLAY_WITH_PHOTO_EDITOR_BTN)
	WebElement play_With_Photo_Editor_Btn;

	public boolean playWithPhotoEditorBtnValidation() {
		if (play_With_Photo_Editor_Btn.isDisplayed()) {
			System.out.println("Play with photo editor button is clickable");
		return true;
		}
		else return false;
	}
	
	public void waitForPlayWithPhotoEditorButton() {
		wait.waitForElementToBeClickable(play_With_Photo_Editor_Btn);
	}
}
