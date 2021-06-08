package com.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.saucedemo.base.TestBase;

public class LoginPage extends TestBase {
	

	public LoginPage() throws IOException {
		
			PageFactory.initElements(driver,this);
			
		
		// TODO Auto-generated constructor stub
	}



	@FindBy(id="user-name")
	WebElement UName;

	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@name='login-button']")
	WebElement LgnBtn;
	
	
	
	public  void loginPg(String un,String pw){
		UName.sendKeys(un);
		password.sendKeys(pw);
		LgnBtn.click();
		 
	}
	
	

}
