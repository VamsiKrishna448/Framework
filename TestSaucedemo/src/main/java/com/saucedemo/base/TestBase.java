package com.saucedemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.saucedemo.util.TestUtil;

public class TestBase {
	
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	public TestBase() throws IOException{
		
		
		try {
			
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\vmalla\\workspace\\TestSaucedemo\\src\\main\\java\\com\\saucedemo\\config\\conf.properties");
			prop.load(ip);
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
	
	public static void initilization(){
		
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Java_01\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else{
			
			System.setProperty("webdriver.chrome.driver","C:\\Java_01\\safaridriver_win32\\safaridriver.exe");
			driver=new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
	

}
