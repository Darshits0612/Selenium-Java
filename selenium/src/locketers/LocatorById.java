package locketers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement UsernameTextFileId = driver.findElement(By.id("username"));
		UsernameTextFileId.sendKeys("admin");
		Thread.sleep(3000);
		WebElement psswordTextFildName = driver.findElement(By.name("pwd"));
		psswordTextFildName.sendKeys("manager");
		Thread.sleep(3000);
		WebElement loginButtoneid = driver.findElement(By.id("loginButton"));
		loginButtoneid.click();
		Thread.sleep(8000);
		driver.quit();
	}

}
