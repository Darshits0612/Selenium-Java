package Action;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOnLoginButton {

	public static void main(String[] args) {
		// TODO Auto-generated meth5od stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement loginbutoon = driver.findElement(By.name("login"));
		// create object of Actions Class
		Actions action = new Actions(driver);
		// action.click(loginbutoon).perform();
		action.moveToElement(loginbutoon).click().perform();
		WebElement button = driver.findElement(By.id("loginbutton"));
//		action.pause(2000).contextClick(button).click().perform();
		action.moveToElement(button).contextClick().perform();
		driver.manage().window().minimize();
		driver.quit();

	}

}
