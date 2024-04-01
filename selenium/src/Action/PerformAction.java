package Action;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.ActualMain;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformAction {

public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	List<WebElement> allNavigationOptions = driver.findElements(By.xpath("//div[@class=\"desktop-navLinks\"]"));
	for (WebElement option : allNavigationOptions) {
		Actions actions=new Actions(driver);
		actions.moveToElement(option).pause(2000).perform();
	}
	driver.manage().window().minimize();
	driver.quit();
	
}
}
