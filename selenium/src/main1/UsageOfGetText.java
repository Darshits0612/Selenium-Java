package main1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgattonpass = driver.findElement(By.xpath("//a[contains(@href,'facebook_login')]"));
		String anchortag = forgattonpass.getText();
		System.out.println("anchoretag = "+ anchortag);
		driver.manage().window().minimize();
		driver.quit(); 
	}

}
