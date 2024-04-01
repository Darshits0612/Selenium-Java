package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest {
	@Test(dataProviderClass=ReadXLSdata.class, dataProvider = "bvtdata")
	public static void LoginTest(String username, String pwd) throws Throwable {
		System.out.println("clicked Successfully");
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		
		driver.findElement(By.id(loc.getProperty("loginTextfield_id"))).sendKeys(username);
		driver.findElement(By.id(loc.getProperty("Next_btn_id"))).click();
		Thread.sleep(4000);
		driver.findElement(By.id(loc.getProperty("pwd_textField_id"))).sendKeys(pwd);
		Thread.sleep(4000);
		driver.findElement(By.id(loc.getProperty("login_btn_id"))).click();
		Thread.sleep(4000);
		driver.findElement(By.className(loc.getProperty("Logout_btn_class"))).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText(loc.getProperty("signout_link"))).click();
	}

	
	

}
