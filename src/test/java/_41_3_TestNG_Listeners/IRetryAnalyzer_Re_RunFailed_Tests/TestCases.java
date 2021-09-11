package _41_3_TestNG_Listeners.IRetryAnalyzer_Re_RunFailed_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {
	@Test
	public void TC_01() {
		System.out.println("TC_01");
	}

	@Test
	public void TC_02() {
		System.out.println("TC_02");
	}

	@Test
	public void TC_03() {
		Assert.fail("Failing TC_03");
		System.out.println("TC_03");
	}

	@Test
	public void TC_04() {
		Assert.fail("Failing TC_04");
		System.out.println("TC_04");
	}
}
