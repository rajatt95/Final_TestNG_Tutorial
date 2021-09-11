package _03_TestNG.Dependency_On_Methods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _14_TestNG_Dependency_1 {

	@Test
	public void TC_SignUp() {
		System.out.println("TC_SignUp");
	}

	// @Test(dependsOnMethods = { "TC_Sign" })
	@Test(dependsOnMethods = { "TC_SignUp" })
	public void TC_Login() {
		System.out.println("TC_Login");
		Assert.fail("Intentionally failing this test case");
	}

	// This TC: TC_UpdateProfile will be Skipped because TC_UpdateProfile is
	// dependent on TC_Login and, we are failing TC_Login intentionally
	@Test(dependsOnMethods = { "TC_Login" })
	public void TC_UpdateProfile() {
		System.out.println("TC_UpdateProfile");
	}

}
