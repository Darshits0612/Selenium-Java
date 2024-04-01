package syncronize;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://irctc.com/contact.html");
		WebElement irctcOption = driver.findElement(By.xpath("//a[contains(.,' IRCTC ')]"));
		Thread.sleep(5000);
		irctcOption.click();
//Search the <table> inside HTMl docs.
		WebElement parentTable = driver.findElement(By.tagName("table"));
		Thread.sleep(5000);
//search the table content only inside the table.
		WebElement buddhistTrainRow = parentTable.findElement(By.xpath("//td[text()='Buddhist train']/parent::tr"));
		Thread.sleep(5000);
// System.out.println(buddhistTrainRow.getText());
		List<WebElement> buddhistCells = buddhistTrainRow.findElements(By.tagName("td"));
		Thread.sleep(5000);
		for (WebElement cell : buddhistCells) {
			if (cell.getText().contains("Visit Website")) {
				String buddhistTrainUrl = cell.findElement(By.tagName("a")).getAttribute("href");
				Thread.sleep(5000);
				System.out.println(buddhistTrainUrl);
			} else {
				System.out.println(cell.getText());
				Thread.sleep(5000);
			}
		}
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}
}