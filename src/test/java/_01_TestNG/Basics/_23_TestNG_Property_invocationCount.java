package _01_TestNG.Basics;

import org.testng.annotations.Test;

//RunTest_MultipleTimes

public class _23_TestNG_Property_invocationCount {

	@Test
	public void TC_01() {
		System.out.println("TC_01");
	}

	// Test case will execute 2 times
	@Test(invocationCount = 2)
	public void TC_02() {
		System.out.println("TC_02");
	}

	// Test case will execute 0 times, means it will be Skipped
	@Test(invocationCount = 0)
	public void TC_03() {
		System.out.println("TC_03");
	}

}