package _02_TestNG.SoftAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Custom {

	@Test
	public void softAssert() {
		System.out.println("---------------------");
		SoftAssert softAssertion = new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
		softAssertion.assertAll();
	}

	@Test
	public void hardAssert() {
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
	}

}
