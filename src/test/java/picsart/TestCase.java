package picsart;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase {
	String picsartUrl = "https://picsart.com/explore";
	String jobs = "https://picsart.com/jobs";
	

	@Test
	/*
	 * Test Case ID:3 Register with empty password 
	 * 3.1 Open browser 
	 * 3.2 Navigate to Picsart.com 
	 * 3.3 Click Sign Up 
	 * 3.4 Enter valid email address in "Email" field(Ex.tinat6043@gmail.com)
	 * 3.5 Enter empty password 
	 * 3.6 Click Sign Up
	 */
	public void registerNegativeTest() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]/*/div[4]/*")).click();
        Thread.sleep(2000);
		WebElement actual = driver.findElement(By.xpath("//div[@class='sign-up-form']/h2"));
		Assert.assertEquals(actual.isDisplayed(), true);
		driver.findElement(By.xpath("//div[@class=\"js-sign-up-flow-modal-content sign-up-flow-modal-content sign-up-view\"]/.."));
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.click();
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.click();
		email.sendKeys("tinat6043@gmail.com");
		password.sendKeys("");
		driver.findElement(By.xpath("//div[@class=\"js-sign-in-up primary-big-btn submit\"]")).click();
		Thread.sleep(2000);
		WebElement actual1 = driver.findElement(By.xpath("//span[@class=\"js-error error\"]/../span[2]"));
		Assert.assertEquals(actual1.isDisplayed(), true);
		Thread.sleep(5000);
		driver.close();
		

	}
	
	
	
	@Test
	/*
	 * Test Case ID:2 Register with invalid email address
	 * 2.1 Open browser 
	 * 2.2 Navigate to Picsart.com
	 * 2.3 Click Sign Up
	 * 2.3 Enter invalid email address(ex.#$%kll@mail.com) in "Email"field
	 * 2.4.Enter valid 6 digit password in "Password" field
	 * 2.5.Click Sign Up
	 */
	 public void invalidEmailAddress() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]/*/div[4]/*")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"js-sign-up-flow-modal-content sign-up-flow-modal-content sign-up-view\"]/.."));
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.click();
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.click();
		email.sendKeys("#$%kll@mail.com");
		password.sendKeys("765432");
		driver.findElement(By.xpath("//div[@class=\"js-sign-in-up primary-big-btn submit\"]")).click();
		Thread.sleep(2000);
		WebElement actual1 = driver.findElement(By.xpath("//form[@class=\"c-autorization-form clearfix\"]//span[1]"));
		Assert.assertEquals(actual1.isDisplayed(), true);
		Thread.sleep(5000);
		driver.close();
		 
	 }
	
	
	
	
	@Test
	/* Test Case ID:8 Register with an empty fields
	 * 8.1 Open browser
	 * 8.2 Navigate to Picsart.com
	 * 8.3 Click on Sign Up button
	 * 8.4 Leave the "Email" field empty
	 * 8.5 Leave the "Password" field empty
	 */

	public void registerWithEmptyFields() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]/*/div[4]/*")).click();
		Thread.sleep(2000);
		WebElement actual = driver.findElement(By.xpath("//div[@class=\"js-sign-up-flow-modal-content sign-up-flow-modal-content sign-up-view\"]/.."));
		Assert.assertEquals(actual.isDisplayed(), true);
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.click();
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.click();
		email.sendKeys("");
		password.sendKeys("");
		driver.findElement(By.xpath("//div[@class=\"js-sign-in-up primary-big-btn submit\"]")).click();
		Thread.sleep(2000);
        WebElement actual1 = driver.findElement(By.xpath("//form[@class=\"c-autorization-form clearfix\"]/./span[1]"));
		Assert.assertEquals(actual1.isDisplayed(), true);
		Thread.sleep(2000);
		WebElement actual2 = driver.findElement(By.xpath("//form[@class=\"c-autorization-form clearfix\"]/./span[2]"));
		Assert.assertEquals(actual2.isDisplayed(), true);
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
	@Test
	/*Test Case ID:22 Login with existing parametres
	 * 22.1 Open browser
	 * 22.2 Navigate to Picsart.com
	 * 22.3 Click on Sign Up button
	 * 22.4 Click Sign In
	 * 22.5 Enter registered email address in "Email" field(ex. "tinat6043@gmail.com")
	 * 22.6 Enter registered password in "Password" field(ex. "12345678")
	 * 22.7 Click Sign In button
	 */
	
	
	public void loginPositive() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]/*/div[4]/*")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"js-switch-to-sign-in\"]")).click();
		Thread.sleep(2000);
		WebElement actual1 = driver.findElement(By.xpath("//div[@class=\" sign-in-form\"]/h2"));
		Assert.assertEquals(actual1.isDisplayed(), true);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		email.click();
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.click();
		email.sendKeys("tinat6043@gmail.com");
		password.sendKeys("12345678");
		driver.findElement(By.xpath("//div[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		WebElement actual2 = driver.findElement(By.xpath("//span[@class=\"c-ga-click circle-border\"]/*"));
		Assert.assertEquals(true, actual2.isDisplayed());
		Thread.sleep(5000);
		driver.close();
	}
	
	
	@Test
	/*
	 * Test Case ID:23 Login with existing email and incorrect password
	 * 23.1 Open browser
	 * 23.2 Navigate to Picsart.com
	 * 23.3 Click on Sign Up button
	 * 23.4 Click Sign In
	 * 23.5 Enter registered email address in "Email" field (ex. "tinat6043@gmail.com")
	 * 23.6 Enter incorrect password in "Password" field (ex. "ryty6768")
	 * 23.7 Click Sign In button
	 */
	
	
	public void incorrectPassword() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]/*/div[4]/*")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"js-switch-to-sign-in\"]")).click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		email.click();
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.click();
		email.sendKeys("tinat6043@gmail.com");
		password.sendKeys("ryty6768");
		driver.findElement(By.xpath("//div[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		WebElement actual = driver.findElement(By.xpath("//span[@class=\"js-error error\"]/../span[3]"));
		Assert.assertEquals(true, actual.isDisplayed());
		Thread.sleep(5000);
		driver.close();
	
	}
	
	
	
	
	@Test
	/*
	 * Test Case ID:33 Is logout link functional?
	 * 33.1 Open browser
	 * 33.2 Navigate to Picsart.com
	 * 33.3 Click on Sign Up button
	 * 33.4 Click Sign In
	 * 33.5 Enter registered email in "Email" field
	 * 33.6 Enter registered password in "Password"field
	 * 33.7 Click Sign In button
	 * 33.8 Logout from account
	 */
			
	public void logoutLink() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]/*/div[4]/*")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"js-switch-to-sign-in\"]")).click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		email.click();
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.click();
		email.sendKeys("tinat6043@gmail.com");
		password.sendKeys("12345678");
		driver.findElement(By.xpath("//div[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"c-ga-click circle-border\"]/*")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/logout\"]/../a[1]")).click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]"));
		WebElement guest = driver.findElement(By.xpath("//div[@class=\"grid-content flexbox\"]"));
		Assert.assertNotEquals(user, guest);
		Thread.sleep(5000);
		driver.close();
			
	}
	
	
	
	@Test
	/*
	 * Test Case ID:42 Validate search field
	 * 42.1 Open browser
	 * 42.2 Navigate to Picsart.com
	 * 42.3 Click on search bar
	 * 42.4 Enter "search item"
	 * 42.5 Click on "search icon"
	 */
	
	public void searchField() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		WebElement searchbar = driver.findElement(By.xpath("//form[@id=\"nav-search-form\"]//div//input"));
		Thread.sleep(2000);
		searchbar.click();
		Thread.sleep(2000);
		Assert.assertEquals(searchbar.isEnabled(), true);
		Thread.sleep(2000);
		searchbar.sendKeys("nature");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"js-search-icon search-icon\"]/../div[2]")).click();
		Thread.sleep(5000);
		driver.close();

	}
	
	
	
	
	@Test
	/*
	 * Test Case ID:49 "About" section and "About Us "subsection functionality
	 * 49.1 Open browser
	 * 49.2 Navigate to Picsart.com
	 * 49.3 Click "About "
	 * 49.4 Click "About Us"
	 */
	
	
	public void aboutFunctionality() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"bullet-list-item\"]/../li[10]")).click();
		WebElement aboutus = driver.findElement(By.xpath("//a[@href=\"/about-us\"]"));
		Thread.sleep(2000);
		Assert.assertEquals(aboutus.isDisplayed(), true);
		WebElement apps = driver.findElement(By.xpath("//a[@href=\"/apps\"]"));
		Thread.sleep(2000);
		Assert.assertEquals(apps.isDisplayed(), true);
		WebElement press = driver.findElement(By.xpath("//a[@href=\"/press-kit\"]"));
		Thread.sleep(2000);
		Assert.assertEquals(press.isDisplayed(), true);
		WebElement research = driver.findElement(By.xpath("//a[@href=\"/research\"]"));
		Thread.sleep(2000);
		Assert.assertEquals(research.isDisplayed(), true);
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	
	@Test
	/*
	 * Test Case ID:50 "Apps"subsection; "Press Center" subsection; "Contact Us" subsection; "Research"subsection functionality
	 * 50.1Open browser
	 * 50.2 Navigate to Picsart.com
	 * 50.3 Click "About "
	 * 50.4 Click "Apps"subsection
	 * 50.5 Click "Press Center" subsection
	 * 50.7 Click "Research"subsection
	 */
	
	public void subsectionFunction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"bullet-list-item\"]/../li[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/about-us\"]")).click();
		String about = driver.getCurrentUrl();
	    Thread.sleep(2000);
		Assert.assertNotEquals(picsartUrl, about);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"bullet-list-item\"]/../li[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/apps\"]")).click();
		String apps = driver.getCurrentUrl();
		Thread.sleep(2000);
		Assert.assertNotEquals(picsartUrl, apps);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"bullet-list-item\"]/../li[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/press-kit\"]")).click();
		String press = driver.getCurrentUrl();
		Thread.sleep(2000);
		Assert.assertNotEquals(picsartUrl, press);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"bullet-list-item\"]/../li[10]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/research\"]")).click();
		String research = driver.getCurrentUrl();
		Thread.sleep(2000);
		Assert.assertNotEquals(picsartUrl, research);
		Thread.sleep(5000);
		driver.close();
		
	}
	
	

	
	
	@Test
	/*
	 * Test Case ID:73 PicsArt Gold functionality
	 * 73.1 Open Browser
	 * 73.2 Navigate to Picsart.com
	 * 73.3 Click on "PicsArt Gold"
	 */

	public void picsartGold() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/gold\"]")).click();
		String gold = driver.getCurrentUrl();
		Thread.sleep(2000);
		Assert.assertNotEquals(gold, picsartUrl);
		Thread.sleep(3000);
		driver.close();
		
}
	
	
	@Test
	/*
	 * 48 Careers section functionality
	 * 48.1 Open browser
	 * 48.2 Navigate to Picsart.com
	 * 48.3 Click on "Careers"
	 */
	
	
	public void careersSection() throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/jobs']")).click();
		Thread.sleep(3000);
		Assert.assertNotEquals(jobs, picsartUrl);
		Thread.sleep(3000);
		driver.quit();
		
	}	
}
