package locketers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextInSeleniumVirsion {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		WebElement seleniumVirson = driver.findElement(By.linkText("4.8.3"));
		Thread.sleep(5000);
		seleniumVirson.click();
		
		
	}
}
