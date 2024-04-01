package Action;

import java.awt.Desktop.Action;
import java.awt.dnd.DragSourceAdapter;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DraggableObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		//since the element is present inside the iframe
		//findelement() has no capacity to search an element inside iframe
		 WebElement draggbleobj = driver.findElement(By.id("draggable"));
		 Actions actions=new Actions(driver);
		 actions.dragAndDropBy(draggbleobj, 100, 100).perform();
		 driver.manage().window().minimize();
		 driver.quit();
		 
		 
		
		
	}

}
