package _01_TestNG.Basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _01_TestNG_Annotations_Sequence_2 {

	@BeforeTest
	public void createDBConn() {
		System.out.println("Creating DB conn");
	}

	@AfterTest
	public void closeDBConn() {
		System.out.println("Closing DB conn");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

	@Test(priority = 2)
	public void doLogin() {
		System.out.println("Executing Login Test");
	}

	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing User Registration Test");
	}

}
