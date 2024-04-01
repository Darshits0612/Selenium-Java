package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		WebElement usernametextfield = driver.findElement(By.name("username"));
		usernametextfield.sendKeys("admin");
		Thread.sleep(5000);
		WebElement psswordtextfield = driver.findElement(By.name("pwd"));
		psswordtextfield.sendKeys("manager");
		Thread.sleep(5000);
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		loginbutton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
