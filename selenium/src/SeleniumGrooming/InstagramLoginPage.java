package SeleniumGrooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {

	public static void main(String[] args) throws Throwable  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/accounts/login/");
		//Thread.sleep(400);
		driver.findElement(By.name("username")).sendKeys("darshitsakariya");
		driver.findElement(By.name("password")).sendKeys("7069949913");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
//		driver.manage().window().minimize();
//		driver.quit();
//			
	}
}