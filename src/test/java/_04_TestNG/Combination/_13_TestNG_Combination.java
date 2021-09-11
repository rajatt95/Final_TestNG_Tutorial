package _04_TestNG.Combination;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _13_TestNG_Combination {

	@Test
	public void TC_01() {
		System.out.println("TC_01");
	}

	@Test(invocationCount = 2, priority = -1)
	public void TC_02() {
		System.out.println("TC_02");
	}

	@Test(invocationCount = 2, priority = 1, enabled = false)
	public void TC_04() {
		System.out.println("TC_04");
	}

	@Test(priority = 0)
	public void TC_03() {
		System.out.println("TC_03");
	}

	@BeforeMethod()
	public void TC_BM() {
		System.out.println("TC_BM");
	}

}