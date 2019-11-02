package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	// Page factory /OR
	
		@FindBy(name = "Email")
		WebElement Email;
	
		@FindBy(name = "Password")
		WebElement Password;
	
		@FindBy(xpath = "//input[@type='submit']")
		WebElement loginBtn;
	
		// Initialise web elements
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		// Actions
		
		public String validatePageTitle()
		{
			return driver.getTitle();
		}
		
		public DashboardPage login(String email,String password)
		{
			Email.sendKeys(email);
			Password.sendKeys(password);
			loginBtn.click();
			return new DashboardPage();
		}
	}	
