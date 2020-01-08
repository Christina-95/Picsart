package com.picsart.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;



public class BrowseLinks extends PicsartHomePage {

	public BrowseLinks(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String ANIME_LINK = "//a[contains(text(),'Anime') and @href='/images/anime']";
	public static final String EDITING_LINK = "//a[contains(text(),'Editing') and @href='/images/editing']";
	public static final String FASHION_LINK = "//a[contains(text(),'Fashion') and @href='/images/fashion']";
	public static final String FLOWERS_LINK = "//a[contains(text(),'Flowers') and @href='/images/flowers']"; 
	public static final String PHOTOGRAPHY_LINK = "//a[contains(text(),'Photography') and @href='/images/photography']";
	public static final String NATURE_LINK = "//a[contains(text(),'Nature') and @href='/images/nature']";
	public static final String IMAGES_LINK = "//a[contains(text(),'All Images') and @href='/images']";
	public static final String STICKERS_ANIME = "//a[contains(text(),'Anime') and @href='/stickers/anime']";
	public static final String STICKERS_CELEBRITIES = "//a[contains(text(),'Celebrities') and @href='/stickers/celebrities']";
	public static final String STICKERS_COLORS = "//a[contains(text(),'Colors') and @href='/stickers/colors']";
	public static final String STICKERS_EMOJI = "//a[contains(text(),'Emoji') and @href='/stickers/emoji']";
	public static final String STICKERS_MEME = "//a[contains(text(),'Meme') and @href='/stickers/meme']";
	public static final String STICKERS_LOVE = "//a[contains(text(),'Love') and @href='/stickers/love']";
	public static final String ALL_STICKERS = "//a[contains(text(),'All Stickers') and @href='/stickers']";
	
	@FindBy (xpath = ANIME_LINK)
	WebElement browseAnimeLink;

	@FindBy (xpath = EDITING_LINK)
	WebElement browseEditingLink;
	
	@FindBy (xpath = FASHION_LINK)
	WebElement browseFashionLink;
	
	@FindBy (xpath = FLOWERS_LINK)
	WebElement browseFlowersLink;
	
	@FindBy (xpath = PHOTOGRAPHY_LINK)
	WebElement browsePhotographyLink;
	
	@FindBy (xpath = NATURE_LINK)
	WebElement browseNatureLink;
	
	@FindBy (xpath = IMAGES_LINK)
	WebElement browseImagesLink;
	
	@FindBy (xpath = STICKERS_ANIME)
	WebElement stickersAnimeLink;
	
	@FindBy (xpath = STICKERS_CELEBRITIES)
	WebElement stickersCelebritiesLink;
	
	@FindBy (xpath = STICKERS_COLORS)
	WebElement stickersColorsLink;
	
	@FindBy (xpath = STICKERS_EMOJI)
	WebElement stickersEmojiLink;
	
	@FindBy (xpath = STICKERS_MEME)
	WebElement stickersMemeLink;
	
	@FindBy (xpath = STICKERS_LOVE)
	WebElement stickersLoveLink;
	
	@FindBy (xpath = ALL_STICKERS)
	WebElement allStickersLink;
	
	public boolean verifyAnimeLink() {
		if (browseAnimeLink.isDisplayed()) {
			System.out.println("Anime link is diplayed");
		return true;
	    }
		else return false;
	}
	
	public boolean verifyEditingLink() {
		if (browseEditingLink.isDisplayed()) {
			System.out.println("Editing link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyFashionLink() {
		if (browseFashionLink.isDisplayed()) {
			System.out.println("Fashion link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyFlowersLink() {
		if (browseFlowersLink.isDisplayed()) {
			System.out.println("Flowers link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyPhotographyLink() {
		if (browsePhotographyLink.isDisplayed()) {
			System.out.println("Photography link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyNatureLink() {
		if (browseNatureLink.isDisplayed()) {
			System.out.println("Nature link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyImagesLink() {
		if (browseImagesLink.isDisplayed()) {
			System.out.println("Images link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyStickersAnimeLink() {
		if (stickersAnimeLink.isDisplayed()) {
			System.out.println("Anime stickers link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyStickersCelebritiesLink() {
		if (stickersCelebritiesLink.isDisplayed()) {
			System.out.println("Celebrities stickers link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyStickersColorsLink() {
		if (stickersColorsLink.isDisplayed()) {
			System.out.println("Colors stickers link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyStickersEmojiLink() {
		if (stickersEmojiLink.isDisplayed()) {
			System.out.println("Emoji stickers link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyStickersMemeLink() {
		if (stickersMemeLink.isDisplayed()) {
			System.out.println("Meme stickers link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyStickersLoveLink() {
		if (stickersLoveLink.isDisplayed()) {
			System.out.println("Love stickers link is displayed");
			return true;
		}
		else return false;
	}
	
	public boolean verifyAllStickersLink() {
		if (allStickersLink.isDisplayed()) {
			System.out.println("All stickers link is displayed");
			return true;
		}
		else return false;
	}
	
	public void waitForAnimeLink() {
		wait.waitForElementToBeClickable(browseAnimeLink);
	}
	
	public BrowseLinks clickOnAnimeLink() {
		browseAnimeLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForEditingLink() {
		wait.waitForElementToBeClickable(browseEditingLink);
	}
	
	public BrowseLinks clickOnEditingLink() {
		browseEditingLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForFashionLink() {
		wait.waitForElementToBeClickable(browseFashionLink);
	}
	
	public BrowseLinks clickOnFashionLink() {
		browseFashionLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForFlowersLink() {
		wait.waitForElementToBeClickable(browseFlowersLink);
	}
	
	public BrowseLinks clickOnFlowersLink() {
		browseFlowersLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForPhotographyLink() {
		wait.waitForElementToBeClickable(browsePhotographyLink);
	}
	
	public BrowseLinks clickOnPhotographyLink() {
		browsePhotographyLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForNatureLink() {
		wait.waitForElementToBeClickable(browseNatureLink);
	}
	
	public BrowseLinks clickOnNatureLink() {
		browseNatureLink.click();
		return new BrowseLinks(driver);
	}

	public void waitForAllImagesLink() {
		wait.waitForElementToBeClickable(browseImagesLink);
	}
	
	public BrowseLinks clickOnAllImagesLink() {
		browseImagesLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForAnimeStickersLink() {
		wait.waitForElementToBeClickable(stickersAnimeLink);
	}
	
	public BrowseLinks clickOnAnimeStickersLink() {
		stickersAnimeLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForCelebritiesLink() {
		wait.waitForElementToBeClickable(stickersCelebritiesLink);
	}
	
	public BrowseLinks clickOnCelebritiesLink() {
		stickersCelebritiesLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForColorsLink() {
		wait.waitForElementToBeClickable(stickersColorsLink);
	}
	
	public BrowseLinks clickOnColorsLink() {
		stickersColorsLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForEmojiLink() {
		wait.waitForElementToBeClickable(stickersEmojiLink);
	}
	
	public BrowseLinks clickOnEmojiLink() {
		stickersEmojiLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForMemeLink() {
		wait.waitForElementToBeClickable(stickersMemeLink);
	}
	
	public BrowseLinks clickOnMemeLink() {
		stickersMemeLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForLoveLink() {
		wait.waitForElementToBeClickable(stickersLoveLink);
	}
	
	public BrowseLinks clickOnLoveLink() {
		stickersLoveLink.click();
		return new BrowseLinks(driver);
	}
	
	public void waitForAllStickersLink() {
		wait.waitForElementToBeClickable(allStickersLink);
	}
	
	public BrowseLinks clickOnAllStickersLink() {
		allStickersLink.click();
		return new BrowseLinks(driver);
	}
}
