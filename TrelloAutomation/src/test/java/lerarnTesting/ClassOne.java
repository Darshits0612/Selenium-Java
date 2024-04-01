package lerarnTesting;

import org.testng.annotations.Test;

public class ClassOne extends testNGBaseClass{

	@Test(groups = {"functional", "adhoc"})
	public void nameA() {

		System.out.println("nameA is Executed from classOne");
	}
	
	@Test(groups = {"functional"})
	public void nameB() {
		System.out.println("nameB is Executed From Classone");
	}
	@Test(groups = {"system"})
	public void nameC() {
		System.out.println("nameC is Executed From ClassOne");

	}

}
