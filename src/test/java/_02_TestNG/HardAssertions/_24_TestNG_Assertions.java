package _02_TestNG.HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _24_TestNG_Assertions {

	@Test
	public void TC_01() {

		String actualMessage = "User created successfully";
		String expectedMessage = "User created successfully.";

		try {
			Assert.assertEquals(actualMessage, expectedMessage, "Verification successful for User creation message");
		} catch (AssertionError e) {
			e.printStackTrace();
			// System.out.println(actualMessage);
		}

		System.out.println("Success");

	}

}