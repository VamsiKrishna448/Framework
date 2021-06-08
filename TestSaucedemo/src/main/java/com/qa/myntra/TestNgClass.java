package com.qa.myntra;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass extends BaseClass{
	
	
	public TestNgClass() throws IOException{
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		
		initilization();
	}
	
	@Test
    public void productPrice(){
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("watches");
		driver.findElement(By.xpath("//li[@class='desktop-suggestion null' and @data-index='1']")).click();
		
		/*Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();*/
		
		
		String str1="//*[@id='desktopSearchResults']/div[2]/section/ul/li[";
		String str2="]/a/div[2]/div/span[1]/span[1]/text()[2]";
		
		for(int i=1;i<=7;i++){
			
			//printing all values by iterating the i value
			String price=driver.findElement(By.xpath("//*[@id='desktopSearchResults']/div[2]/section/ul/li["+i+"]/a/div[2]/div/span[1]/span[1]")).getText();
			System.out.println(price);
		}
	}

	@AfterMethod
    public void tearDown(){
	driver.quit();
	
   }
	
	

}
