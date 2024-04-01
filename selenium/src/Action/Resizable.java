package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(0);
	 	WebElement resizableRight = driver.findElement(By.cssSelector("div[class='ui-resizable-handle ui-resizable-e']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(resizableRight).clickAndHold().moveByOffset(200, 0).perform();
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
