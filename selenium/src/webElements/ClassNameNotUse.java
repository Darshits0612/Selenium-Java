package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameNotUse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//invalid SelectorException selnium - Run - Unchecked
	 WebElement	facebookLogo=driver.findElement(By.className("fb_logo _agiv img"));
	
		
	}
}
