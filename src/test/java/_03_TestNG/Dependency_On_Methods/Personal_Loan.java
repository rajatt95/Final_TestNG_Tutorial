package _03_TestNG.Dependency_On_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Personal_Loan {

	@Test(dependsOnMethods = "TC_APILogin")
	public void TC_WebLogin() {
		System.out.println("Login - Selenium");
	}

	@Test(dependsOnMethods = { "TC_APILogin", "TC_WebLogin" })
	public void TC_MobileLogin() {
		System.out.println("Login - Appium");
	}

	@Test
	public void TC_APILogin() {
		System.out.println("Login - RestAssured");
		Assert.fail("FAiled intentionally");
	}

}
