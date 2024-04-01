package main1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.ByThrowableType;

public class ManageMultipleWindows {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
//		Thread.sleep(3000);
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(2000);
//		driver.get("https://www.selenium.dev/");
//		driver.manage().window().fullscreen();
//		Thread.sleep(3000);
		

		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/search?q=redmi+9+power&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=redmi+9+power%7CMobiles&requestId=1611e3c5-f487-4534-9a87-37cf940cb4dc&as-backfill=on");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	WebElement	flipcartmobile=driver.findElement(By.xpath("//div[text()='REDMI 9 Power (Fiery Red, 128 GB)']/ancestor:: div[@class='_3pLy-c row']/ancestor::a/descendant::div[@class='_24_Dny']"));	
	
	flipcartmobile.click();
	Thread.sleep(5000);
	driver.quit();
	}

}
