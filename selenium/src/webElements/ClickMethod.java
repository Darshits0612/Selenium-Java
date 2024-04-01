package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805955%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805955&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwl6OiBhA2EiwAuUwWZRteZg5exzg9guvot8oVEiHCePBS-MOljcfIOWhTbf04KNi8Io4eTRoCWz4QAvD_BwE");
		Thread.sleep(5000);
		WebElement mobiletextfiled = driver.findElement(By.name("reg_email__"));
		mobiletextfiled.click();	
		Thread.sleep(5000);
		WebElement selectormonth = driver.findElement(By.id("month"));
		selectormonth.click();
		Thread.sleep(5000);	
	     WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Male']/..//input[@type=\"radio\"]"));
		radiobutton.click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
