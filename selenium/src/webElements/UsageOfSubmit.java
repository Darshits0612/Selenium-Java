package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmit {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(5000);
		WebElement submitbutton = driver.findElement(By.cssSelector("button[class='button buttonBlue']"));
		submitbutton.submit();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
//remember those point:-
//1]Whenever we use submit method then must be type of submit
//2]tag must be button
//3]parant or grand parent must be form type

