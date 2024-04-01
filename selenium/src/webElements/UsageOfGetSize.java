package webElements;

import org.asynchttpclient.spnego.NamePasswordCallbackHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));

		// check The size of Both the TextField
		Dimension userNameDimension = userName.getSize();
		Dimension passwordDimension = password.getSize();
		System.out.println("UserName Size = " + userNameDimension);
		System.out.println("pssword size= " + passwordDimension);
		int userNameWidth = userNameDimension.getWidth();
		System.out.println("userName Width = " + userNameWidth);
		int userNameHeight = userNameDimension.getHeight();
		System.out.println("user name Height = "+userNameHeight);
		
		int passwordWidth=passwordDimension.getWidth();
		System.out.println("passWordWidth = "+passwordWidth);
		int passwordHeight=passwordDimension.getHeight();
		System.out.println("passwordHeight = "+ passwordHeight);
		
		driver.manage().window().minimize();
		driver.quit();
	}
}
