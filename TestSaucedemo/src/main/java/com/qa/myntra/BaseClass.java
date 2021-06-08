package com.qa.myntra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.saucedemo.util.TestUtil;

public class BaseClass {
	
	
	public static WebDriver driver;
    public static Properties pro;
	
	public BaseClass() throws IOException{
	
    pro = new Properties();
	 FileInputStream fil;
	try {
		fil = new FileInputStream("C:\\Users\\vmalla\\workspace\\TestSaucedemo\\src\\main\\java\\com\\qa\\myntra\\globalVariables.properties");
		pro.load(fil);
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
			
	}
	
public static void initilization(){
		
		String browser=pro.getProperty("browser");
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
		driver.get(pro.getProperty("url"));
	}

	
	
	
	
		
		
		
	}

