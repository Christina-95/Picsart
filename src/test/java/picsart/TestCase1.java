package picsart;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCase1 {
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
		driver.get("https://picsart.com");
		driver.findElement(By.xpath("//div[@class=\"top-nav-content\"]/*/div[4]/*")).click();
        String expected = "Sign up to continue";
        Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//div[@class='sign-up-form']/h2")).getText();
		Assert.assertEquals(actual, expected);
		driver.findElement(By.xpath("//div[@class=\"js-sign-up-flow-modal-content sign-up-flow-modal-content sign-up-view\"]/.."));
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.click();
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.click();
		email.sendKeys("tinat6043@gmail.com");
		password.sendKeys("");
		driver.findElement(By.xpath("//div[@class=\"js-sign-in-up primary-big-btn submit\"]")).click();
		String expected1 = "Please fill in password field";
		Thread.sleep(2000);
		String actual1 = driver.findElement(By.xpath("//span[@class=\"js-error error\"]/../span[2]")).getText();
		Assert.assertEquals(actual1, expected1);
		Thread.sleep(5000);
		driver.close();
		

	}
	
	
	
	
	
	
	
	@Test
	/*
	 * Test Case ID:71 Picsart.com/jobs "Continue on jobs" button functionality
	 * 71.1 Open browser
	 * 71.2 Navigate to Picsart.com
	 * 71.3 Click on "Careers" section
	 * 71.4 Click on "View Jobs" button
	 * 71.5 Scroll down and click "Continue on jobs" button
	 */
	
	
	public void continueJobs() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(picsartUrl);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href=\"/jobs\"]")).click();
		Thread.sleep(3000);
		Assert.assertNotEquals(jobs, picsartUrl);
		Thread.sleep(2000);
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    driver.switchTo().window(newTab.get(0));
		WebElement veiwjobs = driver.findElement(By.xpath("//div[@class=\"banner-title\"]//a"));
		veiwjobs.click();
		Thread.sleep(2000);
		WebElement continueOnJobs = driver.findElement(By.xpath("//div[@class=\"clearfix link-btn center-align\"]//a"));
		continueOnJobs.click();
		Thread.sleep(2000);
		String vacancies = "https://picsart.com/jobs/vacancies";
		Assert.assertNotEquals(vacancies, jobs);
		Thread.sleep(5000);
		driver.quit();
		
	}
	
}
	