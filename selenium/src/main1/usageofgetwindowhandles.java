package main1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class usageofgetwindowhandles {
public static void main(String[] args) {
	//Instaniate the browser specific class
	WebDriver driver=new EdgeDriver();
	TargetLocator whatidreturned=driver.switchTo();
	whatidreturned.newWindow(WindowType.WINDOW);
	whatidreturned.newWindow(WindowType.WINDOW);
	whatidreturned.newWindow(WindowType.WINDOW);
	//capture all the window ID's
	Set<String> allwindowsId=driver.getWindowHandles();
	//get the no of window id's in 
	int countofid=allwindowsId.size();
	//print the count of window id
	System.out.println("countof ids = "+countofid);
	//print the all window in String Format 
	System.out.println(allwindowsId);
	driver.quit();
}
}
