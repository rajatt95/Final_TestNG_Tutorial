package _01_TestNG.Basics;

import org.testng.annotations.Test;

public class _21_TestNG_Property_timeOut {

	@Test(timeOut = 4000)
	public void TC_APILogin() {
		System.out.println("Login - RestAssured");
		// Assert.fail("FAiled intentionally");
	}

}
