package webElements;

import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayd {

	private static List<WebElement> alldropdown;

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(5000);
		//identify the all dropdown
	     List<WebElement> alldropdown = driver.findElements(By.tagName("select"));
	     System.out.println(alldropdown.size());
	      for (WebElement dropdown : alldropdown )
	      {
	    	  if(dropdown.isDisplayed())
	    	  {
	    		  System.out.println("boolean True");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Boolean False");
	    	  }
	      }
	      
	     driver.quit();
		
		
	}
}
