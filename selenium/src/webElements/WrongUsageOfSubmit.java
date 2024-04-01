package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfSubmit {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		loginbutton.submit();
		driver.manage().window().minimize();
		driver.quit();
	}
}
//NOTE;-why we get error ?
//1]in submit button type of not submit
//2]tagname not button type
//3]pareant not form type
