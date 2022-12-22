package com.testcases;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.pageobjects.textBoxPageObjects;

public class TC_1_TextBox extends BaseClass {
	
//	@Parameters({"firstName", "email"})
	@Test(groups={"Regression"}, dataProvider = "TC_1_TextBoxData")
	public void textBox(String fName, String Email) throws InterruptedException {
		textBoxPageObjects tb = new textBoxPageObjects(driver);
		
		implicitWait(5);
		tb.clickElement();
		
		explicitWait(tb.firstName);
		tb.setFirstName(fName);
		tb.setEmail(Email);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", tb.submit);
		tb.clickSubmit();
		implicitWait(5);
		String actualEmail = tb.validateEmail();
		implicitWait(2);
		assertTrue(actualEmail.contains(Email));
		
		
	}
	
	@DataProvider
	public Object[][] TC_1_TextBoxData() {
		Object[][] data = new Object[1][2];
		data[0][0] = "Sateesh";
		data[0][1] = "Sateesh.Janapana@suneratech.com";
		
		return data;
	}

}
