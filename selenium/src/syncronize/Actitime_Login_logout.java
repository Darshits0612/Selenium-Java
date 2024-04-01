package syncronize;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Actitime_Login_logout {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step:1 Launch The Browser
		String browserName = "edge";
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("firfox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		// step: 2 Pass the main url
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actual LoginPage Title = " + actualLoginPageTitle);
		String expectedLoginPageTitle = "actiTIME - Login";
		System.out.println("expeccted Loginpage Title = " + expectedLoginPageTitle);
		String actualLoginPageUrl = driver.getCurrentUrl();
		System.out.println("actual Loginpage Url = " + actualLoginPageUrl);
		String expectedLoginPageUrlContains = "login.do";
		System.out.println("expectedLoginPageUrlContains = "+expectedLoginPageUrlContains);
		if (actualLoginPageTitle.equals(expectedLoginPageTitle)) {
			System.out.println("Login Page Title Found correct");
			if (actualLoginPageUrl.contains(expectedLoginPageUrlContains)) {
				System.out.println("Login Page Url found corract.");
				System.out.println("pass: Login iss displayed and it is verifyed");
				// Step:3 Enter the valid User Name
				WebElement userNameTextFeild = driver.findElement(By.id("username"));
				userNameTextFeild.sendKeys("admin");
				// Step:4 enter the valid password
				WebElement passwordTextField = driver.findElement(By.name("pwd"));
				passwordTextField.sendKeys("manager");
				// Step:5 click on Login Button
				WebElement loginButton = driver.findElement(By.id("loginButton"));
				loginButton.click();
				String actualHomePageTitle = driver.getTitle();
				System.out.println("actualHomePageTitle = " + actualHomePageTitle);
				String expectedHomePageTitle = "actiTIME - Enter Time-Track";
				System.out.println("expectedHomePageTitle = " + expectedHomePageTitle);
				String actualHomePageUrl = driver.getCurrentUrl();
				System.out.println("actualHomePageUrl" + actualHomePageUrl);
				String expectedHomePageUrlContains = "user/submit_tt.do";
				System.out.println("expectedHomePageUrlContains = " + expectedHomePageUrlContains);
				WebElement logoutLink = driver.findElement(By.id("logoutLink"));
				if (actualHomePageTitle.equals(expectedHomePageTitle)) {
					System.out.println("Home Page Title Found Correct");
					if (actualHomePageUrl.contains(expectedHomePageUrlContains)) {
						System.out.println("Home Page Url Found Correct.");
						if (logoutLink.isDisplayed()) {
							System.out.println("LogOut Option is visible.");
							System.out.println(
									"pass: The HomePage is displayed upon clicking on Login button and it is verifyed");
							// Step 06: Click On LogOut Option
							logoutLink.click();
							if (driver.getTitle().equals(expectedHomePageTitle)) {
								System.out.println("Login Page Title Found Correct after Logout.");
								if (driver.getCurrentUrl().contains(expectedLoginPageUrlContains)) {

									System.out.println("Login Page URL Found Correct after LogOut");
									System.out
											.println("pass: The Login Page Displayed after Logout and it is verifyed");

								} else {
									System.out.println("Fail: The Login Page Url is Found Incorrect After Logout");
								}
							} else {
								System.out.println("Fail: Login Page Title Found Incorrect After Logout");
							}

						} else {
							System.out.println("Fail: The Logout Options Not Displayed");
						}

					} else {
						System.out.println("Fail: Home Page Url Found Incorrect.");
					}
				} else {
					System.out.println("Fail: HomePage TitleFound Incorrect");
				}

			} else {
				System.out.println("Fail: Login Page URL Found Incorrect");
			}
		} else {
			System.out.println("Fail: Login Page Title Found Incorrect");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}