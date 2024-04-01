package precticTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  
	@BeforeMethod
  public void launceBrowser() {
	  System.out.println("Browser is launce succsess");
	}
	@Test(priority = 2)
  public void login() {
	System.out.println("login page should be displayed");
}
	@Test(priority = 3)
  public  void sendFrindRequest() {
	  System.out.println("i had send the frind request to my frinds");
  }
	@AfterMethod
  public void closeBrowser() {
	  System.out.println("i close The Browser");
  }
	
}
