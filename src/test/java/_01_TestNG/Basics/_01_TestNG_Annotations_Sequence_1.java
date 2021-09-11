package _01_TestNG.Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _01_TestNG_Annotations_Sequence_1 {

	@Test
	public void TC_01() {
		System.out.println("TC_01() method");
	}

	@BeforeTest
	public void TC_BT() {
		System.out.println("@BeforeTest method");
	}

	@BeforeSuite
	public void TC_BS() {
		System.out.println("@BeforeSuite method");
	}

	@AfterMethod
	public void TC_AM() {
		System.out.println("@AfterMethod method");
	}

	@BeforeClass
	public void TC_BC() {
		System.out.println("@BeforeClass method");
	}

	@BeforeMethod
	public void TC_BM() {
		System.out.println("@BeforeMethod method");
	}

	@AfterClass
	public void TC_AC() {
		System.out.println("@AfterClass method");
	}

	@AfterSuite
	public void TC_AS() {
		System.out.println("@AfterSuite method");
	}

	@AfterTest
	public void TC_AT() {
		System.out.println("@AfterTest method");
	}

	@Test
	public void TC_02() {
		System.out.println("TC_02 method");
	}

}