package _01_TestNG.Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _24_TestNG_Property_alwaysRun {

	@Test
	public void TC_01() {
		System.out.println("TC_01");
		Assert.fail("FAiling TC_01");
	}

	@Test(dependsOnMethods = { "TC_01" })
	public void TC_02() {
		System.out.println("TC_02");
	}

	@Test(dependsOnMethods = { "TC_01" }, alwaysRun = true)
	public void TC_03() {
		System.out.println("TC_03");
	}

}
