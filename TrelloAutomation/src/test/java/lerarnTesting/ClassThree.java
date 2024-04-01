package lerarnTesting;

import org.testng.annotations.Test;

public class ClassThree extends testNGBaseClass {
	@Test(groups = {"competibility"})
	public void nameF() {
		System.out.println("nameF Executed from classThree");
	}
	@Test(groups = {"exploratory"})
	public void nameE() {
		System.out.println("nameE Executed from ClassThree");
	}
	@Test(groups = {"usability", "functional"})
	public void nameG() {
		System.out.println("nameG Executed From ClassThree");
	}
	

}
