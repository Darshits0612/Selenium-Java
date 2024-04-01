package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SlidingActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/child::span"));
		Actions actions = new Actions(driver);
//		actions.dragAndDropBy(slider, 550, 0).perform();
//		actions.clickAndHold(slider).moveByOffset(400, 0).release().perform();
		actions.moveToElement(slider).clickAndHold(slider).moveByOffset(400, 0).release(slider).build().perform();
		
	}

}
