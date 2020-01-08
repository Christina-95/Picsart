package com.picsart.pages.home.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.picsart.pages.base.PicsartBasePageObject;
import com.picsart.pages.home.PicsartHomePage;
import com.picsart.pages.home.header.product.EditingToolsPage;

public class ProductLinks extends PicsartHomePage {

	public ProductLinks(WebDriver driver) {
		super(driver);
	}
	
	PicsartBasePageObject wait = new PicsartBasePageObject(driver);
	
	public static final String EDITING_TOOLS_LINK = "//a[contains(text(),'Editing Tools')]";
	public static final String PHOTO_EDITOR_LINK = "//a[contains(text(),'Photo Editor')]";
	public static final String COLLAGE_MAKER_LINK = "//a[contains(text(),'Collage Maker')]";
	public static final String MEME_GENERATOR_LINK = "//a[contains(text(),'Meme generator')]";
	public static final String TEXT_EDITOR_LINK = "//a[contains(text(),'Text editor')]";
	public static final String STICKER_MAKER_LINK = "//a[contains(text(),'Sticker Maker')]";
	public static final String BACKGROUND_EDITOR_LINK = "//a[contains(text(),'Background editor')]";
	public static final String PHOTO_EFFECTS_LINK = "//a[contains(text(),'Photo effects')]";
	public static final String SKETCH_EFFECT_LINK = "//a[contains(text(),'Sketch effect')]";
	public static final String MAGIC_EFFECTS_LINK = "//a[contains(text(),'Magic effects')]";
	public static final String DOUBLE_EXPOSURE_LINK = "//a[contains(text(),'Double Exposure')]";
	public static final String COLOR_FILTERS_LINK = "//a[contains(text(),'Color filters')]";
	public static final String MOBILE_APPS_LINK = "//a[contains(text(),'Mobile apps')]";
	public static final String CHALLENGES_LINK = "//a[contains(text(),'Challenges')]";
	
	@FindBy (xpath = EDITING_TOOLS_LINK)
	WebElement editingToolsLink;
	
	@FindBy (xpath = PHOTO_EDITOR_LINK)
	WebElement photoEditorLink;
	
	@FindBy (xpath = COLLAGE_MAKER_LINK)
	WebElement collageMakerLink;
	
	@FindBy (xpath = MEME_GENERATOR_LINK)
	WebElement memeGeneratorLink;

	@FindBy (xpath = TEXT_EDITOR_LINK)
	WebElement textEditorLink;
	
	@FindBy (xpath = STICKER_MAKER_LINK)
	WebElement stickerMakerLink;
	
	@FindBy (xpath = BACKGROUND_EDITOR_LINK)
	WebElement backgroundEditorLink;
	
	@FindBy (xpath = PHOTO_EFFECTS_LINK)
	WebElement photoEffectsLink;
	
	@FindBy (xpath = SKETCH_EFFECT_LINK)
	WebElement sketchEffectLink;
	
	@FindBy (xpath = MAGIC_EFFECTS_LINK)
	WebElement magicEffectsLink;
	
	@FindBy (xpath = DOUBLE_EXPOSURE_LINK)
	WebElement doubleExposureLink;
	
	@FindBy (xpath = COLOR_FILTERS_LINK)
	WebElement colorFiltersLink;
	
	@FindBy (xpath = MOBILE_APPS_LINK)
	WebElement mobileAppsLink;
	
	@FindBy (xpath = CHALLENGES_LINK)
	WebElement challengesLink;
	
	public void waitForEditingToolsLink() {
		wait.waitForElementToBeClickable(editingToolsLink);
	}
	
	public EditingToolsPage editingToolsClick() {
		editingToolsLink.click();
		return new EditingToolsPage(driver);
	}
}

