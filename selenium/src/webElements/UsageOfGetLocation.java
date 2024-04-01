package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class UsageOfGetLocation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		// identify the user name
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));

		Point userNameCordinates = userName.getLocation();
		Point passwordcordinates=password.getLocation();
		System.out.println("userNameCordinates = " + userNameCordinates);
		System.out.println("passwordcordinates = "+passwordcordinates);
		
		int usernameStartx = userNameCordinates.getX();
		System.out.println("userNameStart X= " + usernameStartx);
		int userNameStartY = userNameCordinates.getY();
		System.out.println("userNameCordinates = "+ userNameStartY);
		driver.manage().window().minimize();
		driver.quit();

	}
}
