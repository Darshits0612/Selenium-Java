package main1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenMultipleWindowOfSameType {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		 WebDriver driver=new EdgeDriver(); 
		 Thread.sleep(3000);
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 Thread.sleep(3000);
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 Thread.sleep(3000);
		 
		 driver.close();
		 
	}

}