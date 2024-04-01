package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInteractionWichAreInvisible {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/shop/men");
		Thread.sleep(5000);
		WebElement menclothingsection = driver
				.findElement(By.xpath("//a[text()='MEN']/parent::li/descendant::span[text()='CLOTHING']"));
		Thread.sleep(5000);
		menclothingsection.click();
		
		
	}
}
