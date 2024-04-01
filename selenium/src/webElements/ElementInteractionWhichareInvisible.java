package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementInteractionWhichareInvisible {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjwo7iiBhAEEiwAsIxQEQRWMO1CfSgxHhKUo2LNcWTqb1KBPWIkAQKQJAnKF2YnjFh1tTIflxoCBK0QAvD_BwE");
		Thread.sleep(5000);
		WebElement mantshirtsoptions=driver.findElement(By.xpath("//div[@data-group='men']//a[text()='T-Shirts']"));
		mantshirtsoptions.click();
	}
}
