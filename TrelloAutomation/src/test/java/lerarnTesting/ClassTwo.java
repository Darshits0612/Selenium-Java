package lerarnTesting;

import org.testng.annotations.Test;

public class ClassTwo extends testNGBaseClass{
	
	@Test(groups = {"system", "smoke"})
	public void nameD() {
		System.out.println("nameD Executed From ClassTwo");
	}
	@Test(groups = {"integration", "functional"})
	public void nameE() {
		System.out.println("nameE Executed From ClassTwo");
	}
	
}
