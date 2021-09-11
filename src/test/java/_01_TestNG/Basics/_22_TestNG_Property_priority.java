package _01_TestNG.Basics;

import org.testng.annotations.Test;

public class _22_TestNG_Property_priority {

	@Test(priority = -11)
	public void TC_05() {
		System.out.println("TC_05");
	}

	@Test(priority = 11)
	public void TC_02() {
		System.out.println("TC_02");
	}

	// By default, Priority is 0
	@Test
	public void TC_08() {
		System.out.println("TC_08");
	}

	// By default, Priority is 0
	@Test
	public void TC_07() {
		System.out.println("TC_07");
	}

	// By default, Priority is 0
	@Test
	public void TC_03() {
		System.out.println("TC_03");
	}

	@Test(priority = 5)
	public void TC_04() {
		System.out.println("TC_04");
	}

	@Test(priority = -3)
	public void TC_01() {
		System.out.println("TC_01");
	}
}