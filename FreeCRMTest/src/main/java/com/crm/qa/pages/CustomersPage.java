	package com.crm.qa.pages;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	import com.crm.qa.base.TestBase;
	
	public class CustomersPage extends TestBase {
	
		
		@FindBy(name = "SearchEmail")
		WebElement searchEmail;
	
		@FindBy(xpath = "//td[text(),contains 'james_pan@nopCommerce.com']")
		WebElement customerEmail;
	
		public CustomersPage()
	
		{
	
			PageFactory.initElements(driver, this);
		}
	
		public void enterCustomerEmail() {
			searchEmail.sendKeys("james_pan@nopCommerce.com");
			searchEmail.click();
			
		}
	
	}
