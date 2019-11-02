	package com.crm.qa.tests;
	
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	
	import com.crm.qa.base.TestBase;
	import com.crm.qa.pages.CustomersPage;
	import com.crm.qa.pages.DashboardPage;
	import com.crm.qa.pages.LoginPage;
	
	public class DashboardPageTest extends TestBase {
	
		DashboardPage dp;
		LoginPage lp;
		CustomersPage cp;	
	
		public DashboardPageTest()
	
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
	
		@Test(priority = 1)
	
		public void LoggedUserTest() {
			
			String luser = dp.verifyLoggedUser();
			Assert.assertEquals(luser, "John Smith");
		}
	
		@Test(priority = 2)
	
		
		public void PageHeaderTest() {
				boolean flag = dp.verifyPageHeader();
				Assert.assertTrue(flag);
		}
		
		@Test(priority=3)
		
		public void ClickCustomerLinkTest()
		{
		 		dp.clickOnCustomerLink();
		 		Assert.assertTrue(true, "Customers Page is displayed");
			 		
		}
		
	
	@AfterMethod()
	
		public void tearDown() {
		driver.quit();
		}
	
	}
