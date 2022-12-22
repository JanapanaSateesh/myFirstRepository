package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class dockerTest {
	
	public static void main(String args[]) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("https://sunera3-dev-ed.my.salesforce.com/");
		String title = driver.getTitle();
		System.out.println("Page title is :"+title);
	}

}
