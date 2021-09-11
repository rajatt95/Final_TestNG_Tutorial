package _01_TestNG.Basics;

import org.testng.annotations.Test;

public class _25_TestNG_Property_enabled {

	@Test(enabled = false)
	public void TC_05() {
		System.out.println("TC_05");
	}

	@Test(enabled = false, alwaysRun = true)
	public void TC_03() {
		System.out.println("TC_03");
	}

	@Test(alwaysRun = true, enabled = false)
	public void TC_04() {
		System.out.println("TC_04");
	}

	@Test()
	public void TC_02() {
		System.out.println("TC_02");
	}

}