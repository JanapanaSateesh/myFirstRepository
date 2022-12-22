package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class formsPageObects {
	WebDriver driver;
	public formsPageObects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Forms']")
	@CacheLookup
	public WebElement forms;
	
	@FindBy(xpath="//span[text()='Practice Form']")
	@CacheLookup
	public WebElement practiceForms;
	
	@FindBy(id="firstName")
	@CacheLookup
	public WebElement firstName;
	
	@FindBy(id="lastName")
	@CacheLookup
	public WebElement lastName;
	
	@FindBy(id="userEmail")
	@CacheLookup
	public WebElement userEmail;
	
	@FindBy(xpath="//label[text()='Male']")
	@CacheLookup
	public WebElement gender;
	
	@FindBy(id="userNumber")
	@CacheLookup
	public WebElement userNumber;
	
	@FindBy(id="uploadPicture")
	@CacheLookup
	public WebElement uploadPicture;
	
	public void clickForms() {
		forms.click();
	}
	
	public void clickPageForms() {
		practiceForms.click();
	}
	
	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void setLasstName(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void setEmail(String Email) {
		userEmail.sendKeys(Email);
	}
	
	public void clickGender() {
		gender.click();
	}
	
	public void setPhoneNumber(String PhNumber) {
		userNumber.sendKeys(PhNumber);
	}
	
	public void setPhoto(String path) {
		uploadPicture.sendKeys(path);
	}
	
}
