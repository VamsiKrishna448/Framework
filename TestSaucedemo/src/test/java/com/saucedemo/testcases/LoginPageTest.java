package com.saucedemo.testcases;





import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.base.TestBase;
import com.saucedemo.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	public LoginPage logPg;

	public LoginPageTest() throws IOException{
		super();
		
	}
	
	@BeforeTest
	public void setUp() throws IOException{
		initilization();
		logPg=new LoginPage();
	}
	
	@Test
	public void loginTest(){
		logPg.loginPg(prop.getProperty("username"),prop.getProperty("password"));
	}

}
