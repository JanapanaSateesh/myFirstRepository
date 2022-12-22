package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pageobjects.formsPageObects;

public class TC_3_PageForm extends BaseClass{

	@Test(groups={"Smoke"})
	public void pageForm() throws InterruptedException {
		
		formsPageObects fp = new formsPageObects(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", fp.forms);
		
		
		explicitWait(fp.forms);
		fp.clickForms();
		
		explicitWait(fp.practiceForms);
		fp.clickPageForms();
		explicitWait(fp.firstName);
		fp.setFirstName("Sai Kumar");
		fp.setLasstName("Janapana");
		fp.setEmail("SaiKumar@gmail.com");
		
		
		js.executeScript("arguments[0].scrollIntoView();", fp.gender);
		fp.clickGender();
		
		explicitWait(fp.userNumber);
		fp.setPhoneNumber("9642803001");
		implicitWait(5);
		
		js.executeScript("arguments[0].scrollIntoView();", fp.uploadPicture);
		implicitWait(5);
		fp.setPhoto("C:\\Users\\102789\\Downloads\\sampleFile.jpeg");
		
	}
		

}
