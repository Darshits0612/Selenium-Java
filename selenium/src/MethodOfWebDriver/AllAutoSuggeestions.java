package MethodOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllAutoSuggeestions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=Bing_Google%20DSA-%20Searchterms-%20Test-%20EX&utm_source=bing");
		WebElement searchTextFeild = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		searchTextFeild.sendKeys("shirts");
		//By using findElements() we can handle Auto suggestion
		List<WebElement> allautosuggestions = driver.findElements(By.xpath("//ul[@class='desktop-group']/li[not(@class='desktop-suggestionTitle')]"));
		for (WebElement suggestions : allautosuggestions) {
			String options = suggestions.getText();
			System.out.println(options);
		}
		driver.manage().window().minimize();
		driver.quit();
		
	}
}
