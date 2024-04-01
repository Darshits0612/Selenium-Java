package locketers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class ClickOnForrgottenPssword {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		WebElement frrgottenpssword = driver.findElement(By.linkText("Forgotten password?"));
		
		frrgottenpssword.click();		
		Thread.sleep(5000);
		WebElement cancelButtonClick = driver.findElement(By.linkText("Cancel"));
		cancelButtonClick.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
