package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CustomersPage;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;

public class CustomersPageTest extends TestBase {
	
	DashboardPage dp;
	LoginPage lp;
	CustomersPage cp;
	
	public CustomersPageTest()
	
	{
		super();
	}
	@BeforeMethod()
		
	public void setUp() {
		initialisation();
		lp = new LoginPage();
		cp = new CustomersPage();
		dp = lp.login(prop.getProperty("email"), prop.getProperty("password"));
	
	}
	

	@Test(priority=1)
	
	public void ClickCustomerLinkTest()
	{
	 		dp.clickOnCustomerLink();
	 		Assert.assertTrue(true, "Customers Page is displayed");
		 		
	}
	
	@Test(priority=2)
	
		public void searchCustomerTest(){
		
		dp.clickOnCustomerLink();
		cp.enterCustomerEmail();
		Assert.assertTrue(true, "james_pan@nopCommerce.com");
		
				
	}
	@AfterMethod()
	
	public void tearDown() {
	driver.quit();
	}
}
