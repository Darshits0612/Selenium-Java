package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLoginFacebook {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
	WebElement	loginbutton=driver.findElement(By.id("loginbutton"));
	Thread.sleep(5000);
	//loginbutton.sendKeys(null);
	loginbutton.sendKeys(Keys.ENTER);
	Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}
