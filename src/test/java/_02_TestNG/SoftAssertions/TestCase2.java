package _02_TestNG.SoftAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test()
	public void validateTitles() {

		System.out.println("Beginning");

		String expected_title = "Yahoo";// Excel sheet
		String actual_title = "Gmail";// Selenium

		SoftAssert softAssert = new SoftAssert();

		System.out.println("Validting Title");
		softAssert.assertEquals(actual_title, expected_title);

		// isElementPresent("xpath") - True, False

		System.out.println("Validting TextBox presence");
		softAssert.assertEquals(true, false, "TextBox not present");

		// Assert.assertEquals(false, "Element not found");

		System.out.println("Validting Image");
		softAssert.assertEquals(true, false, "Image not present");

		softAssert.fail("Failing the test as Condition is not met");

		System.out.println("Ending");

		softAssert.assertAll();

		/*
		 * System.out.println("Validting Title"); Assert.assertEquals(actual_title,
		 * expected_title);
		 * 
		 * // isElementPresent("xpath") - True, False
		 * 
		 * System.out.println("Validting TextBox presence"); Assert.assertEquals(true,
		 * false);
		 * 
		 * 
		 * // Assert.assertEquals(false, "Element not found");
		 * 
		 * System.out.println("Validting Image"); Assert.assertEquals(true, false);
		 * 
		 * Assert.fail("Failing the test as Condition is not met");
		 * 
		 * System.out.println("Ending");
		 */ }

}
