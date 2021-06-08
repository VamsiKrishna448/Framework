package com.saucedemo.pages;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;
import com.saucedemo.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(css="button.btn_primary")
	WebElement btn;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bike-light']")
	WebElement btn1;
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement drpDownBtn;
	
	
	@FindBy(xpath="//div[@id='shopping_cart_container']//child::a")
	WebElement yourOrders;
	
	@FindBy(xpath="//div[@class='bm-burger-button']//child::button")
	WebElement ss;
	
	
	public HomePage() throws IOException{
		
		PageFactory.initElements(driver,this);
	
	}
	
	
	public void homepage() throws InterruptedException{
		Thread.sleep(2000);
		btn.click();
		
	}
	
	public void clickOnDrpDown(){
	
		
		Select select=new Select(drpDownBtn);
		select.selectByIndex(1);
	}
	
	public void scrollDown() throws InterruptedException{
		btn1.click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		//driver.quit();
		
	}
	
	public void checkYourOrders() throws InterruptedException{
		yourOrders.click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
	}
	
	public void screenSht() throws IOException{
		ss.click();
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("C:\\Java_01\\ScreenShot/ThreeDots.png"));
	}

}
