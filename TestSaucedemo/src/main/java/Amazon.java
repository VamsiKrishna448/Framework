import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {

	@Test
	public void method1(){
	System.setProperty("webdriver.chrome.driver", "C:\\Java_01\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	
	
	/*//clicking Account in sign button
	Actions action=new Actions(driver);
	WebElement signIn=driver.findElement(By.xpath("//div[@class='nav-line-1-container']//descendant::span"));
	action.moveToElement(signIn).build().perform();
	driver.findElement(By.xpath("//div[contains(text(),'Your Account')]//following-sibling::a//child::span[contains(text(),'Account')]")).click();;*/
	
	
	
	/*//printing Text of all anchor tags present in sign in page
	Actions action=new Actions(driver);
	WebElement signIn=driver.findElement(By.xpath("//div[@class='nav-line-1-container']//descendant::span"));
	action.moveToElement(signIn).build().perform();
	List<WebElement> ele=driver.findElements(By.xpath(("//div[@id='nav-al-signin']//parent::div[@id='nav-al-container']//descendant::a")));
	for(WebElement i:ele){
		
		System.out.println(i.getText());
	}*/
	
	
	
	/*//For dynamic elements matching with the text and clicking on element
	Actions action=new Actions(driver);
	WebElement signIn=driver.findElement(By.xpath("//div[@class='nav-line-1-container']//descendant::span"));
	action.moveToElement(signIn).build().perform();	
	List<WebElement> ele1=driver.findElements(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[3]/a"));
	System.out.println(ele1.size());
	String s1="/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[3]/a[";
	String s2="]/span";
	String s3="Orders";
	
	for(int i=1;i<=ele1.size();i++){
		String s4=driver.findElement(By.xpath(s1+i+s2)).getText();
		
		if(s4.equalsIgnoreCase(s3)){
			System.out.println(s4);
			driver.findElement(By.xpath(s1+i+s2)).click();
			break;
		}
		
	}*/
	
	
	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ga");
	//driver.findElement(By.xpath("//input[@class='a-button-input']//following-sibling::span[@class='a-button-text' and contains(text(),'Don')]")).click();
	/*String parentId=driver.getWindowHandle();
	System.out.println(parentId);
	Set<String> ele=driver.getWindowHandles();
	Iterator<String> it=ele.iterator();
	while(it.hasNext()){
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(childId);
	}*/
	
	/*//clicking dropDown button without creating object to Select class
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("gaming");
	driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @value='Go']")).click();
	driver.findElement(By.xpath("//i[@class='a-icon a-icon-dropdown']//preceding-sibling::span")).click();*/
	
	//driver.quit();
	}
	
	
	
}
