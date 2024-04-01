package Action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickHoldDragTillLastSelectable {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		WebElement srcElement = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement targetElement = driver.findElement(By.xpath("//li[text()='Item 7']"));
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 100).pause(200).clickAndHold(srcElement).moveToElement(targetElement).release().perform();

	}

}
