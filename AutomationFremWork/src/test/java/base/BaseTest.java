package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;

	
	@BeforeMethod
	public void setUp() throws IOException {
		if (driver == null) {
			FileReader fr = new FileReader(
					"C:\\Users\\Admin\\eclipse-workspace\\AutomationFremWork\\src\\test\\resources\\configfile\\config.properties");
			FileReader fr1=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\AutomationFremWork\\src\\test\\resources\\configfile\\locater.properties");
			prop.load(fr);
			loc.load(fr1);

			if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
			} else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.get(prop.getProperty("url"));
			}

		}
	}

	@AfterMethod
	public void closeTerm() {
		driver.manage().window().minimize();
		driver.quit();

	}

}
