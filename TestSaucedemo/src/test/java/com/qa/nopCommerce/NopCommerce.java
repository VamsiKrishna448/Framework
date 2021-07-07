package com.qa.nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NopCommerce {

	
		// TODO Auto-generated method stub
	public static WebDriver driver;
	
	
		@BeforeMethod
		public static void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Java_01\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
		}
		
		@Test(enabled=false)
		public static void logoTest(){
		//logo
		Boolean logo=driver.findElement(By.xpath("//img[@title='nopCommerce']//parent::a")).isEnabled();
		System.out.println(logo);
		
		}
		
		@Test
		public static void productTest() throws InterruptedException{
		//selecting product in span
		//driver.findElement(By.xpath("//ul[contains(@class,'top-menu desktop')]//child::ul[@class='sublist']//preceding-sibling::span[text()='Product']")).click();
		
	
		Actions action=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//ul[contains(@class,'top-menu desktop')]//child::ul[@class='sublist']//preceding-sibling::span[text()='Product']"));
		action.moveToElement(a).perform();
		driver.findElement(By.xpath("//ul[@class='sublist']//child::li//child::a[@href='/en/showcase']//parent::li//preceding-sibling::li//child::a[@href='/en/demo']")).click();
		Thread.sleep(100);
		
		}
		
		@AfterMethod(enabled=false)
		public  static void tearDown(){
			driver.quit();
		}
		
	

}
