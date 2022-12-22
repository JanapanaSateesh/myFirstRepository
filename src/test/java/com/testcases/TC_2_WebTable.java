package com.testcases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.textBoxPageObjects;
import com.pageobjects.webTablePageObjects;

public class TC_2_WebTable extends BaseClass {
	
	@Test( groups={"Smoke"}, dataProvider = "TC_2_testData")
	public void webTable(String fName, String lName, String Email, String Age, String Sal, String Dept) throws InterruptedException {
		
		webTablePageObjects wb = new webTablePageObjects(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", wb.webTable);
		implicitWait(5);
		wb.clickWebTable();
		
		implicitWait(4);
		explicitWait(wb.addNewRecord);
		
		js.executeScript("arguments[0].scrollIntoView();", wb.addNewRecord);
		wb.clickAddNewRecord();
		explicitWait(wb.firstName);
		wb.setFirstName(fName);
		wb.setLasstName(lName);
		wb.setEmail(Email);
		wb.setAge(Age);
		wb.setSalary(Sal);
		wb.setDepartment(Dept);
		implicitWait(3);
		wb.clickSubmit();
		implicitWait(7);
		wb.getTextOfTable(Email);
		
	}
	
	@DataProvider
	public Object[][] TC_2_testData() {
		Object[][] data = new Object[1][6];
		
		data[0][0] = "Sandhya Rani";
		data[0][1] = "Janapana";
		data[0][2] = "Sandhya@gmail.com";
		data[0][3] = "23";
		data[0][4] = "30000";
		data[0][5] = "Beautician";
		return data;
		
	}

}
