package com.picsart.homepage.header;

import org.testng.annotations.Test;

import com.picsart.base.BaseTest;
import com.picsart.pages.home.PicsartHomePage;
import com.picsart.pages.home.header.BrowseLinks;
import com.picsart.pages.home.header.browse.AnimePage;
import com.picsart.pages.home.header.browse.CelebritiesPage;
import com.picsart.pages.home.header.browse.ColorsPage;
import com.picsart.pages.home.header.browse.EditingPage;
import com.picsart.pages.home.header.browse.EmojiPage;
import com.picsart.pages.home.header.browse.FashionPage;
import com.picsart.pages.home.header.browse.FlowersPage;
import com.picsart.pages.home.header.browse.ImagesPage;
import com.picsart.pages.home.header.browse.LovePage;
import com.picsart.pages.home.header.browse.MemePage;
import com.picsart.pages.home.header.browse.NaturePage;
import com.picsart.pages.home.header.browse.PhotographyPage;
import com.picsart.pages.home.header.browse.StickersAnimePage;
import com.picsart.pages.home.header.browse.StickersPage;

public class BrowseLinksTest extends BaseTest {
	
	@Test
	//Test Case ID:96 "Anime" link functionality	
	public void animeLinkValidation() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Browse visibility
		homePage.waitForBrowseVisibility();
		//Step 3:Move mouse to Browse
		homePage.moveToBrowse();
		//verify that Browse links are displayed
		BrowseLinks browseLinks = new BrowseLinks(driver);
		browseLinks.verifyAnimeLink();
		browseLinks.verifyEditingLink();
		browseLinks.verifyFashionLink();
		browseLinks.verifyFlowersLink();
		browseLinks.verifyPhotographyLink();
		browseLinks.verifyNatureLink();
		browseLinks.verifyImagesLink();
		browseLinks.verifyStickersAnimeLink();
		browseLinks.verifyStickersCelebritiesLink();
		browseLinks.verifyStickersColorsLink();
		browseLinks.verifyStickersEmojiLink();
		browseLinks.verifyStickersMemeLink();
		browseLinks.verifyStickersLoveLink();
		browseLinks.verifyAllStickersLink();
		//wait for "Anime" link to be clickable
		browseLinks.waitForAnimeLink();
		//Step 4:Click on Images "Anime" link
		browseLinks.clickOnAnimeLink();
		//veryify that "Anime" link is valid and Images/Anime page is opened
		AnimePage imagesAnimePage = new AnimePage(driver);
		imagesAnimePage.waitForImagesAnimePage();
		imagesAnimePage.validateImagesAnimePage();
	}
	
	@Test
	//Test Case ID:97 "Editing" link functionality
	public void editingLinkValidation() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Browse visibility
		homePage.waitForBrowseVisibility();
		//Step 3:Move mouse to Browse
		homePage.moveToBrowse();
		//wait for "Editing" link to be clickable
		BrowseLinks browseLinks = new BrowseLinks(driver);
		browseLinks.waitForEditingLink();
		//Step 4:Click on Images "Editing" link
		browseLinks.clickOnEditingLink();
		//veryify that "Editing" link is valid and Images/Editing page is opened
		EditingPage imagesEditingPage = new EditingPage(driver);
		imagesEditingPage.waitForImagesEditingPage();
		imagesEditingPage.validateImagesEditingPage();
	}
	
	@Test
	//Test Case ID:98 "Fashion" link functionality
	public void fashionLinkValidation() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Browse visibility
		homePage.waitForBrowseVisibility();
		//Step 3:Move mouse to Browse
		homePage.moveToBrowse();
		//wait for "Fashion" link to be clickable
		BrowseLinks browseLinks = new BrowseLinks(driver);
		browseLinks.waitForFashionLink();
		//Step 4:Click on Images "Fashion" link
		browseLinks.clickOnFashionLink();
		//veryify that "Fashion" link is valid and Images/Fashion page is opened
		FashionPage imagesFashionPage = new FashionPage(driver);
		imagesFashionPage.waitForImagesFashionPage();
		imagesFashionPage.validateImagesFashionPage();
	}
	
	@Test
	//Test Case ID:99 "Flowers" link functionality
	public void flowersLinkValidation() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Browse visibility
		homePage.waitForBrowseVisibility();
		//Step 3:Move mouse to Browse
		homePage.moveToBrowse();
		//wait for "Flowers" link to be clickable
		BrowseLinks browseLinks = new BrowseLinks(driver);
		browseLinks.waitForFlowersLink();
		//Step 4:Click on Images "Flowers" link
		browseLinks.clickOnFlowersLink();
		//veryify that "Flowers" link is valid and Images/Flowers page is opened
		FlowersPage imagesFlowersPage = new FlowersPage(driver);
		imagesFlowersPage.waitForImagesFlowersPage();
		imagesFlowersPage.validateImagesFlowersPage();
	}
	
	@Test
	//Test Case ID:100 "Photography" link functionality
	public void photographyLinkValidation() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Browse visibility
		homePage.waitForBrowseVisibility();
		//Step 3:Move mouse to Browse
		homePage.moveToBrowse();
		//wait for "Photography" link to be clickable
		BrowseLinks browseLinks = new BrowseLinks(driver);
		browseLinks.waitForPhotographyLink();
		//Step 4:Click on Images "Photography" link
		browseLinks.clickOnPhotographyLink();
		//veryify that "Photography" link is valid and Images/Photography page is opened
		PhotographyPage imagesPhotographyPage = new PhotographyPage(driver);
		imagesPhotographyPage.waitForImagesPhotographyPage();
		imagesPhotographyPage.validateImagesPhotographyPage();
	}
	
	@Test
	//Test Case ID:101 "Nature" link functionality
	public void natureLinkValidation() {
		// Step 1:Open browser - done in @BaseTest
		// Step 2:Navigate to Picsart.com
		PicsartHomePage homePage = new PicsartHomePage(driver);
		//wait for Browse visibility
		homePage.waitForBrowseVisibility();
		//Step 3:Move mouse to Browse
		homePage.moveToBrowse();
		//wait for "Nature" link to be clickable
		BrowseLinks browseLinks = new BrowseLinks(driver);
		browseLinks.waitForNatureLink();
		//Step 4:Click on Images "Nature" link
		browseLinks.clickOnNatureLink();
		//veryify that "Nature" link is valid and Images/Nature page is opened
		NaturePage imagesNaturePage = new NaturePage(driver);
		imagesNaturePage.waitForImagesNaturePage();
		imagesNaturePage.validateImagesNaturePage();
	}
	
		@Test
	    //Test Case ID:102 "All Images" link functionality
		public void allImagesLinkValidation() {
			// Step 1:Open browser - done in @BaseTest
			// Step 2:Navigate to Picsart.com
			PicsartHomePage homePage = new PicsartHomePage(driver);
			//wait for Browse visibility
			homePage.waitForBrowseVisibility();
			//Step 3:Move mouse to Browse
			homePage.moveToBrowse();
			//wait for "All Images" link to be clickable
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForAllImagesLink();
			//Step 4:Click on "All Images" link
			browseLinks.clickOnAllImagesLink();
			//veryify that "All Images" link is valid and Images/Images page is opened
			ImagesPage imagesPage = new ImagesPage(driver);
			imagesPage.waitForImagesPage();
			imagesPage.validateImagesPage();
		}
		
		@Test
	    //Test Case ID:103 "Anime" link functionality
		public void allAnimeStickersLinkValidation() {
			// Step 1:Open browser - done in @BaseTest
			// Step 2:Navigate to Picsart.com
			PicsartHomePage homePage = new PicsartHomePage(driver);
			//wait for Browse visibility
			homePage.waitForBrowseVisibility();
			//Step 3:Move mouse to Browse
			homePage.moveToBrowse();
			//wait for "Anime" link to be clickable
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForAnimeStickersLink();
			//Step 4:Click on Stickers "Anime" link
			browseLinks.clickOnAnimeStickersLink();
			//veryify that "Anime" link is valid and Stickers/Anime page is opened
			StickersAnimePage stickersAnimePage = new StickersAnimePage(driver);
			stickersAnimePage.waitForStickersAnimePage();
			stickersAnimePage.validateStickersAnimePage();
		}	
		
		@Test
	    //Test Case ID:104 "Celebrities" link functionality
		public void celebritiesLinkValidation() {
			// Step 1:Open browser - done in @BaseTest
			// Step 2:Navigate to Picsart.com
			PicsartHomePage homePage = new PicsartHomePage(driver);
			//wait for Browse visibility
			homePage.waitForBrowseVisibility();
			//Step 3:Move mouse to Browse
			homePage.moveToBrowse();
			//wait for "Celebrities" link to be clickable
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForCelebritiesLink();
			//Step 4:Click on "Celebrities" link
			browseLinks.clickOnCelebritiesLink();
			//veryify that "Celebrities" link is valid and Stickers/Celebrities page is opened
			CelebritiesPage celebritiesPage = new CelebritiesPage(driver);
			celebritiesPage.waitForCelebritiesPage();
			celebritiesPage.validateCelebritiesPage();
		}
		
		@Test
	    //Test Case ID://105 "Colors" link functionality
		public void colorsLinkValidation() {
			// Step 1:Open browser - done in @BaseTest
			// Step 2:Navigate to Picsart.com
			PicsartHomePage homePage = new PicsartHomePage(driver);
			//wait for Browse visibility
			homePage.waitForBrowseVisibility();
			//Step 3:Move mouse to Browse
			homePage.moveToBrowse();
			//wait for "Colors" link to be clickable
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForColorsLink();
			//Step 4:Click on  "Colors" link
			browseLinks.clickOnColorsLink();
			//veryify that "Colors" link is valid and Stickers/Colors page is opened
			ColorsPage colorsPage = new ColorsPage(driver);
			colorsPage.waitForColorsPage();
			colorsPage.validateColorsPage();
		}
		
		@Test
	    //Test Case ID://106 "Emoji" link functionality
		public void emojiLinkValidation() {
			PicsartHomePage homePage = new PicsartHomePage(driver);
			homePage.waitForBrowseVisibility();
			homePage.moveToBrowse();
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForEmojiLink();
			browseLinks.clickOnEmojiLink();
			EmojiPage emojiPage = new EmojiPage(driver);
			emojiPage.waitForEmojiPage();
			emojiPage.validateEmojiPage();
		}
		
		@Test
		//Test Case ID:107 "Meme" link functionality
		public void memeLinkValidation() {
			PicsartHomePage homePage = new PicsartHomePage(driver);
			homePage.waitForBrowseVisibility();
			homePage.moveToBrowse();
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForMemeLink();
			browseLinks.clickOnMemeLink();
			MemePage memePage = new MemePage(driver);
			memePage.waitForMemePage();
			memePage.validateMemePage();
		}
		
		@Test
		//Test Case ID:108 "Love" link functionality
		public void loveLinkValidation() {
			PicsartHomePage homePage = new PicsartHomePage(driver);
			homePage.waitForBrowseVisibility();
			homePage.moveToBrowse();
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForLoveLink();
			browseLinks.clickOnLoveLink();
			LovePage lovePage = new LovePage(driver);
			lovePage.waitForLovePage();
			lovePage.validateLovePage();
		}
		
		@Test
		//Test Case ID:109 "All Stickers" link functionality
		public void allStickersLinkValidation() {
			PicsartHomePage homePage = new PicsartHomePage(driver);
			homePage.waitForBrowseVisibility();
			homePage.moveToBrowse();
			BrowseLinks browseLinks = new BrowseLinks(driver);
			browseLinks.waitForAllStickersLink();
			browseLinks.clickOnAllStickersLink();
			StickersPage stickersPage = new StickersPage(driver);
			stickersPage.waitForStickersPage();
			stickersPage.validateStickersPage();
		}
}
