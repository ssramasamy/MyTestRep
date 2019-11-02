package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class DashboardPage extends TestBase{
	
	
	@FindBy(xpath= "//li[@class='account-info']")
	WebElement loggedUser;
	
	@FindBy(xpath= "//span[@class='logo-lg']")
	WebElement pageHeader;
	
	@FindBy(xpath="//span[contains(text(),'Customers')]")
	WebElement linkCustomer;
	
	@FindBy(xpath="//span[@class='menu-item-title'][contains(text(),'Customers')]")
	WebElement newCustomer;
	
	
			
	public DashboardPage()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoggedUser()
	{
		return loggedUser.getText();
	}
	public boolean verifyPageHeader()
	
	{
		return pageHeader.isDisplayed();
										
	}
	public CustomersPage clickOnCustomerLink()
	{
		linkCustomer.click();
		newCustomer.click();
		return new CustomersPage();
	}
	
	
		
		
	
	
}
