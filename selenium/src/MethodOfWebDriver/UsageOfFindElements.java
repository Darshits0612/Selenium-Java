package MethodOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsageOfFindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get(
				"https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Google%20DSA-%20Searchterms-%20Test-%20EX&utm_source=bing");
		List<WebElement> allNavigationMenu = driver.findElements(By.xpath("//div[@class='desktop-navLinks']"));
		for (WebElement options : allNavigationMenu) {
			String optionsName = options.getText();
			System.out.println(optionsName);
		}
		driver.manage().window().minimize();
		driver.quit();

	}

}
