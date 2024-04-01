package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProblemWithGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	  WebElement forgattonpassword = driver.findElement(By.xpath("//div[@class='_6ltj']"));
	 String	subtext=forgattonpassword.getText();
		System.out.println("subtext = "+ subtext);
		driver.manage().window().minimize();
		driver.quit();
		
		
	}

}
