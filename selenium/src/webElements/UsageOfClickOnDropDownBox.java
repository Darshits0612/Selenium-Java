package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClickOnDropDownBox {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805955%7Cb%7Cfb%20sign%20up%7C&placement=&creative=550525805955&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9062011%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwo7iiBhAEEiwAsIxQETou9HdTwuQUX0aPF8DjwNYezyK3nMf8kLO05FQgKpaEJY7lD9id6RoCLBkQAvD_BwE");
		Thread.sleep(5000);
		//WebElement dropdownbutton = driver.findElement(By.id("month"));
		//dropdownbutton.click();
         WebElement monthselect=driver.findElement(By.xpath("//option[text()='Feb']"));
		monthselect.click();
         Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}
}
