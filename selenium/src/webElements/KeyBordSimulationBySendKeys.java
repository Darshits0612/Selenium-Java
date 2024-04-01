package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBordSimulationBySendKeys {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
	    WebElement usernametexrfield=driver.findElement(By.name("username"));
		usernametexrfield.sendKeys("admin");
		Thread.sleep(5000);
		usernametexrfield.sendKeys(Keys.TAB + "manager" + Keys.TAB +Keys.TAB + Keys.TAB +Keys.ENTER);
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
		
	
	}
}
