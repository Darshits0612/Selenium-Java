package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnable {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(5000);
	//identyfy the signup button/submit buttom
		WebElement	submitbutton=driver.findElement(By.xpath("//button[@type=\"submit\"]/ancestor::form[@id='reg']"));
		Thread.sleep(5000);
	if(submitbutton.isEnabled())
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}

	driver.manage().window().minimize();
	driver.quit();
	}


}
