package _01_TestNG.Basics;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class _11_TestNG_SkipTest {

	@Test
	public void TC_02() {
		System.out.println("TC_02");
	}

	// @Test
	public void TC_01() {
		System.out.println("TC_01");
	}

	// As Experienced Professional, will use this
	@Test(enabled = false)
	public void TC_03() {
		System.out.println("TC_03");
	}

	// Test case will execute 0 times, means it will be Skipped
	@Test(invocationCount = 0)
	public void TC_05() {
		System.out.println("TC_05");
	}

	// Correct way, but not recommended
	@Test
	public void TC_04() {
		System.out.println("Before calling SkipException");
		throw new SkipException("Intentionally skipping the test case.");

		// Unreachable code
		// System.out.println("After calling SkipException");
	}

}