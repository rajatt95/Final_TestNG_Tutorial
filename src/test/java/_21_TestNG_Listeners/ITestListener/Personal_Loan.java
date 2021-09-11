package _21_TestNG_Listeners.ITestListener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Personal_Loan {

	@Test
	public void TC_1() {

		System.out.println("TC_1");
	}

	@Test
	public void TC_2() {
		System.out.println("TC_2");
		Assert.fail("Intentionally failing the test case");
	}

	@Test
	public void TC_3() {
		System.out.println("TC_3");
		throw new SkipException("Intentionally skipping the test case");
	}

}