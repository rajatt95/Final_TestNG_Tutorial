package _41_1_TestNG.Manual_Re_RunFailed_Tests;

/**
 * 1. Run all test cases
 * 
 * 2. Refresh the Project
 * 
 * 3. Go to test-output folder.
 * 
 * 4. testng-failed.xml
 *  
 * 5. Run as TestNG Suite.
 * */
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
