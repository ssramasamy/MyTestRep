package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DashboardPage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	public LoginPage lp;
	public DashboardPage dp;
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod()

	public void setUp(){
		initialisation();
		lp = new LoginPage();
		}
	
	@Test (priority=1)
	
	public void loginPageTitletest()
	
	{
		String PageTitle = lp.validatePageTitle();
		Assert.assertEquals(PageTitle, "Your store. Login");
		
	}
	@Test (priority=2)
	
	public void LoginTest()
	
	{
		dp = lp.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod()
	
		
	public void tearDown()
	{
		driver.quit();
	}
	
	
		
	}

