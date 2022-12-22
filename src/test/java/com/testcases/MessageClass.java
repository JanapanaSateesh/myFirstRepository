package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MessageClass {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://messages.google.com/web/authentication");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//*[text()='JD-navihq']")).click();
		String msg = driver.findElement(By.xpath("//div[@class='text-msg ng-star-inserted']")).getText();
		Thread.sleep(5000);
		System.out.println(msg);
		

	}

}
