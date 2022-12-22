package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pageobjects.formsPageObects;
import com.pageobjects.widgetsPageObjects;

public class TC_4_Widgets extends BaseClass {
	@Test(groups={"Regression"})
	public void widgets() throws InterruptedException {
		
		widgetsPageObjects wp = new widgetsPageObjects(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", wp.widgets);
		explicitWait(wp.widgets);
		wp.clickWidget();
		
		implicitWait(5);
//		js.executeScript("arguments[0].scrollIntoView();", wp.selectMenu);
//		implicitWait(5);
		wp.clickSelectMenu();
//		
//		js.executeScript("arguments[0].scrollIntoView();", wp.titleDropdown);
//		explicitWait(wp.titleDropdown);
		implicitWait(3);
		wp.clickOnTitle();
		
		explicitWait(wp.selectTitle);
		wp.selectTitle();
	}
		
		

}
