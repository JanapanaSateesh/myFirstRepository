package com.testcases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.pageobjects.loginpageObjects;
import com.utilities.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	readConfig rd = new readConfig();
	public String url = rd.getUrl();
	
	public static WebDriver driver;
	
	
	@BeforeMethod(groups= {"Smoke"})
	public void setUp() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		loginpageObjects lp = new loginpageObjects(driver);
		Thread.sleep(5);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", lp.element);
		Thread.sleep(5);
		lp.clickElement();
	}
	
	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void implicitWait(int timeinsec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinsec));
	}
	
	@AfterMethod(groups= {"Smoke"})
	public void tearDown() {
		//driver.quit();
	}
	

}
