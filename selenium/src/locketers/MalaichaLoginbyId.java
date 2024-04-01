package locketers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MalaichaLoginbyId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		
		WebElement loginbuttonbyId = driver.findElement(By.id("my-acc-btn"));
		
		Thread.sleep(5000);
		loginbuttonbyId.click();
		
		Thread.sleep(5000);
		WebElement signeinbuttoncss = driver.findElement(By.cssSelector("button[type='submit']"));
		signeinbuttoncss.click();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
