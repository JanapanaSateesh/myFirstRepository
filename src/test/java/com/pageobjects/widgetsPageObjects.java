package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class widgetsPageObjects {

	WebDriver driver;
	public widgetsPageObjects (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Widgets']")
	@CacheLookup
	public WebElement widgets;
	
	@FindBy(xpath="//span[text()='Select Menu']")
	@CacheLookup
	public WebElement selectMenu;
	
	@FindBy(xpath="//div[text()='Select Title']")
	@CacheLookup
	public WebElement titleDropdown;
	
	@FindBy(xpath="//div[text()='Mr.']")
	@CacheLookup
	public WebElement selectTitle;
	
	public void clickWidget() {
		widgets.click();
	}
	
	public void clickSelectMenu() {
		selectMenu.click();
	}
	
	public void clickOnTitle() {
		titleDropdown.click();
	}
	
	public void selectTitle() {
		selectTitle.click();
	}

}
