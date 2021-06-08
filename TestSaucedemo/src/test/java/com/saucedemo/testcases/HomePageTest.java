package com.saucedemo.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.base.TestBase;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	
		
		LoginPage loginPage;
		HomePage homePage;
		
		
		public HomePageTest() throws IOException
		{
			super();
		}
		
		@BeforeMethod
		public void setUp() throws IOException
		{
			initilization();
			loginPage=new LoginPage();
			loginPage.loginPg(prop.getProperty("username"),prop.getProperty("password"));
		}
		
		@Test(priority=1)
		public void productSelect() throws IOException, InterruptedException{
			
			homePage=new HomePage();
			homePage.homepage();

		}
		
		@Test(priority=2)
		public void selctDrpDownButton() throws IOException{
			homePage=new HomePage();
			homePage.clickOnDrpDown();
		
		}
		@Test(priority=3)
		public void checkOrders() throws IOException, InterruptedException{
			homePage=new HomePage();
			homePage.checkYourOrders();
		}
		
		@Test(priority=4)
		public void screenShot() throws IOException, InterruptedException{
			homePage=new HomePage();
			homePage.screenSht();
		}
		
	/*	@Test(priority=3)
		public void scrollDown() throws InterruptedException, IOException{
			homePage=new HomePage();
			homePage.scrollDown();
			
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}*/
}
