package com.pageobjects;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webTablePageObjects {

	WebDriver driver;
	public webTablePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Web Tables']")
	@CacheLookup
	public WebElement webTable;
	
	@FindBy(id="addNewRecordButton")
	@CacheLookup
	public WebElement addNewRecord;
	
	@FindBy(id="firstName")
	@CacheLookup
	public WebElement firstName;
	
	@FindBy(id="lastName")
	@CacheLookup
	public WebElement lastName;
	
	@FindBy(id="userEmail")
	@CacheLookup
	public WebElement userEmail;
	
	@FindBy(id="age")
	@CacheLookup
	public WebElement age;
	
	@FindBy(id="salary")
	@CacheLookup
	public WebElement salary;
	
	@FindBy(id="department")
	@CacheLookup
	public WebElement department;
	
	@FindBy(xpath="//*[text()='Submit']")
	@CacheLookup
	public WebElement submit;
	
	@FindBy(xpath="//div[@class='rt-tbody']//div//div//div")
	@CacheLookup
	public List<WebElement> textOfTheTable;
	
	
	
	public void clickWebTable() {
		webTable.click();
	}
	
	public void clickAddNewRecord() {
		addNewRecord.click();
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
	
	public void setAge(String Age) {
		age.sendKeys(Age);
	}
	
	public void setSalary(String Salary) {
		salary.sendKeys(Salary);
	}
	
	public void setDepartment(String Dept) {
		department.sendKeys(Dept);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public void getTextOfTable(String Email) 
	{
		int textSize = textOfTheTable.size();
		
		int x=0;
		for(WebElement i : textOfTheTable) 
		{
			
			 String tabname= i.getText();
			 if(tabname.equalsIgnoreCase(Email)) {
				 assertTrue(tabname.contains(Email));
			 }
	            
	           
		}
		
		
	}
}
