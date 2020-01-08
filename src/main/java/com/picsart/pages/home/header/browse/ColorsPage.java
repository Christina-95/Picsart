package com.picsart.pages.home.header.browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;

public class ColorsPage extends PicsartHomePage {

	public ColorsPage(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	
  public static final String COLORS= "//a[contains(text(),'Colors') and @class='active-sub']";
	
	@FindBy (xpath = COLORS)
	WebElement colorsLink;
	
	public boolean validateColorsPage() {
		if (colorsLink.isDisplayed()) {
			System.out.println("Colors link is valid and Stickers/Colors page is opened");
			return true;
		}
		else return false;
	}
	
	public void waitForColorsPage() {
		wait.waitForElementVisibility(colorsLink);
	}


}
