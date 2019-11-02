package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddANewCustomerPage;
import com.crm.qa.pages.CustomersPage;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;

public class AddANewCustomerPageTest extends TestBase{
	
	DashboardPage dp;
	LoginPage lp;
	CustomersPage cp;
	AddANewCustomerPage ap;
	
	public AddANewCustomerPageTest()
	
	{
		super();
	}
	@BeforeMethod()
	
	public void setUp() {
		initialisation();
		lp = new LoginPage();
		cp = new CustomersPage();
		dp = new DashboardPage();
		ap = new AddANewCustomerPage();
		dp = lp.login(prop.getProperty("email"), prop.getProperty("password"));
	
	}
	@Test(priority =1)
		public void clickAndVerifyNewCustomerTest(){
		dp.clickOnCustomerLink();
		ap.clickAddNewButton();
		Assert.assertTrue(true, "Add NewCustomer Page is displayed");
		ap.verifyAddnewCustomerLabel();
		Assert.assertTrue(ap.verifyAddnewCustomerLabel(), "Add a new customer");
		
	}
	
		
	@Test(priority =2)
		public void clickbacktoCustomerTest(){
		dp.clickOnCustomerLink();
		ap.clickAddNewButton();
		ap.clickbacktoCustomerLink();
		Assert.assertTrue(true, "Customers Page is displayed");
		}
	@Test(priority =3)
	    
	    public void clickLogoutTest(){
		ap.clickLogoutButton();
		Assert.assertTrue(true, "Login Page is displayed");
	}
@AfterMethod()
	
	public void tearDown() {
	driver.quit();
	}
	}
	

