package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfClickCheckbox {
public static void main(String[] args) throws Throwable {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	WebElement checkboxbutton=driver.findElement(By.id("keepLoggedInCheckBox"));
	checkboxbutton.click();
	Thread.sleep(5000);
	driver.manage().window().minimize();
	driver.quit();
	
	
	
}
}
