package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class AddANewCustomerPage extends TestBase {
	
	@FindBy(xpath = "//h1[@class='pull-left']")
	WebElement newCustomer;
	
	@FindBy(xpath = "//a[@class='btn bg-blue']")
	WebElement AddnewBtn;
	
	@FindBy(xpath = "//a[contains(text(),'back to customer list')]")
	WebElement backtoCustomer;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement LogoutBtn;
	
	public AddANewCustomerPage()
	
	{

		PageFactory.initElements(driver, this);
	}
	
	public void clickAddNewButton(){
		AddnewBtn.click();
		
	}
	
	
	public boolean verifyAddnewCustomerLabel(){
		 boolean ncustomer = newCustomer.isDisplayed();
		 return ncustomer;
		 
	} 
	public CustomersPage clickbacktoCustomerLink(){
		backtoCustomer.click();
		return new CustomersPage();
	}
	public LoginPage clickLogoutButton(){
		LogoutBtn.click();
		return new LoginPage();
	}
		
		
}
	

