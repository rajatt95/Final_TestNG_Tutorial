package _02_TestNG.HardAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import _01_TestNG.Basics.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _21_TestNG_Assertions extends TestBase {

	@Test
	public void TC_LoginError_Validation() {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		preSetup(driver);

		navigateToURL(driver, "https://in.yahoo.com/");
		System.out.println("Clicking on Sign in");
		driver.findElement(By.linkText("Sign in")).click();

		System.out.println("Clicking on Login");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

		validateErrorMessage(driver);

		quitDriver(driver);
	}

	private void validateErrorMessage(WebDriver driver) {
		holdScript(2);
		String actualValidation = driver.findElement(By.xpath("//p[@id='username-error']")).getText();
		String expectedValidation = "Sorry, we don't recognise this email";

		System.out.println("actualValidation: " + actualValidation);

		Assert.assertEquals(actualValidation, expectedValidation, "Login Error message validation");
		System.out.println("Login Error message validation successful");
	}

}