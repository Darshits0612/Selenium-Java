package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    WebElement emailTaxtFeild=driver.findElement(By.id("email"));
		
	   String tagName=emailTaxtFeild.getTagName();
		System.out.println("tagName= "+tagName);
		
		driver.manage().window().minimize();
		driver.quit();
		
	
	}

}
