package main1;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.ActualMain;

public class MultipleWindowHandelIt {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		String url=driver.getCurrentUrl();
		Set<String> allwindowId=driver.getWindowHandles();
		System.out.println(allwindowId);
		for(String WindowId : allwindowId)
		{
			String actualurl=driver.switchTo().window(WindowId).getCurrentUrl();
			System.out.println(actualurl);
			
		}
		
		
	}
}
