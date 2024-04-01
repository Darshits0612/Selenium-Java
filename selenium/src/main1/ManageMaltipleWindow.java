package main1;

import java.util.Set;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;


public class ManageMaltipleWindow {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

//		WebDriver driver = new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Dimension TargetSeleniumSize = new Dimension(200, 800);
		driver.manage().window().setSize(TargetSeleniumSize);
		driver.get("https://www.selenium.dev/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Dimension TargetInstaSize = new Dimension(2000, 300);
		driver.manage().window().setSize(TargetInstaSize);
		driver.get("https://www.instagram.com/");

		Set <String> allWindows =driver.getWindowHandles();
		for (String wid : allWindows) {
			String windowurl=driver.switchTo().window(wid).getCurrentUrl();
			if(windowurl.equals("https://www.facebook.com/"))
			{
				driver.get("https://www.selenium.dev/");
				Thread.sleep(3000);
				Dimension seleniumSize=new Dimension(200, 800);
				driver.manage().window().setSize(seleniumSize);
				Thread.sleep(3000);
			}
				
		}
		
		Thread.sleep(5000);
		driver.quit();

		
	}

}
