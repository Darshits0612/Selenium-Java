package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithAppandingDataTextFiled {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(5000);
		WebElement usernametextfield = driver.findElement(By.id("username"));
		usernametextfield.clear();
		usernametextfield.sendKeys("darshit");
		Thread.sleep(5000);
		WebElement passwordtextfield = driver.findElement(By.id("password"));
		passwordtextfield.clear();
		passwordtextfield.sendKeys("selenium");
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
