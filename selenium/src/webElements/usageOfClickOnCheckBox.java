package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usageOfClickOnCheckBox {

private Object key;

public static void main(String[] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	Thread.sleep(5000);
	
	WebElement usernametextfiled = driver.findElement(By.id("username"));
//	usernametextfiled.click();
	Thread.sleep(5000);
	usernametextfiled.sendKeys("admin");	
	usernametextfiled.sendKeys(Keys.TAB);
	
	
	
	
	
}
}
