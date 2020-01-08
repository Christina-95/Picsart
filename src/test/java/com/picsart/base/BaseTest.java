package com.picsart.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	String picsartUrl = "https://picsart.com/explore";
	
	
	protected WebDriver driver;
	
	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(picsartUrl);	
		//driver.manage().window().maximize();
	}
	
	@AfterTest
	public void close() {
		driver.quit();
	}
	
	

}
