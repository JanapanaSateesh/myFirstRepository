package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class textBoxPageObjects {
	WebDriver driver;
	public textBoxPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='btn btn-light ']//span[text()='Text Box']")
	@CacheLookup
	public WebElement textBox;
	
	@FindBy(id="userName")
	@CacheLookup
	public WebElement firstName;
	
	@FindBy(id="userEmail")
	@CacheLookup
	public WebElement email;
	
	@FindBy(id="submit")
	@CacheLookup
	public WebElement submit;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement validateEmail;
	
	public void clickElement() {
		textBox.click();
	}
	
	public void setFirstName(String name) {
		firstName.sendKeys(name);
	}
	
	public void setEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public String validateEmail() {
		String actualEmail = validateEmail.getText();
		return actualEmail;
	}
}
