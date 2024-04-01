package main1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class usagegettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
	String actual_url=driver.getCurrentUrl();
		System.out.println(actual_url);
		String actualtitle=driver.getTitle();
		System.out.println("actualtitle="+actualtitle);
		driver.close();
	}

}
