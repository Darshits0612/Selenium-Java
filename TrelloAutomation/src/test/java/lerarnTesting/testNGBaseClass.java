 package lerarnTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testNGBaseClass {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("based class Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("based class after Method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("bsed Class Before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("based class After Class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("based class BeforeTest");
	}
	@AfterTest
	public void afteTest() {
		System.out.println("based class AfterTest ");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("based class BeforeSuite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("based class AfterSuite");
	}
	
}
