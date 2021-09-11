package _02_TestNG.HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

import _01_TestNG.Basics.TestBase;

public class _22_TestNG_Assertions extends TestBase {

	@Test
	public void TC_01() {

		int a = 10;
		int b = 20;

		String actualMessage = "Rajat";
		String expectedMessage = "Verma";

		// This message will printed if assertion fails
		Assert.assertEquals(a, b, "int Validation check: a and b are not matching");
		Assert.assertEquals(actualMessage, expectedMessage,
				"String Validation check: Actual and Expected are not matching");

		Assert.assertTrue(b > a, "b is not greater than a");

		System.out.println("Assertions passed");
	}

}