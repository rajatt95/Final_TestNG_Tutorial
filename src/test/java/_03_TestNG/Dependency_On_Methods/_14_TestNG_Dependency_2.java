package _03_TestNG.Dependency_On_Methods;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class _14_TestNG_Dependency_2 {

	@Test
	public void TC_01() {
		assertTrue(3 > 12);
		System.out.println("TC_01");
	}

	@Test(dependsOnMethods = { "TC_01" })
	public void TC_02() {
		System.out.println("TC_02");
	}

}
