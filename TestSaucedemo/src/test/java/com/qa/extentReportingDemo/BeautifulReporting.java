package com.qa.extentReportingDemo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BeautifulReporting {
	
	public WebDriver driver;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent(){
		htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.setSystemInfo("HostName", "LocalHost");
		extent.setSystemInfo("TesterName", "Vamsi");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome");
	}
	
	@AfterTest
	public void endReport(){
		extent.flush();
	}
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Java_01\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/en/demo");
	}
	
	@Test
	public void noCommerceTitleTest(){
		test=extent.createTest("noCommerceTitleTest");
		//extent.set(test);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Free and open-source eCommerce platform. ASP.NET based shopping cart. - nopCommerce");
	}
	
	@Test
	public void noCommercelLogoTest(){
		test=extent.createTest("noCommercelLogoTest1");
		Boolean status=driver.findElement(By.xpath("//div[@class='home-banner-image-section']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test
	public void noCommercialLoginTest(){
		test=extent.createTest("noCommercialLoginTest");
		Assert.assertTrue(false);
	}
	//ITestResut interface
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			test.log(Status.FAIL,"Test Case Failed is"+result.getName());//to add the name in extent report
			test.log(Status.FAIL,"Test Case Failed is"+result.getThrowable());//to add error or exception in extent report
			String screenshotPath=BeautifulReporting.getScreenshot(driver,result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP){
			
			test.log(Status.SKIP,"Test Case Failed is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			
			test.log(Status.PASS,"Test Case Failed is"+result.getName());
		}
		
	}
		public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		
		
			     String dateName= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			     String destination = System.getProperty("user.dir")+"/Screenshots"+screenshotName+dateName+".png";
			     File finalDestination=new File(destination);
			     FileUtils.copyFile(src, finalDestination);
			     return destination;
		}
	}
	
	
	
	
	


