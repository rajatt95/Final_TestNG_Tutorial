package _11_2_TestNG.Parameterization.Using_DataProviders_SameClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_Parameterization_DataProvider {

	WebDriver driver;

	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}

	@BeforeMethod
	public void setEnv() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://en-gb.facebook.com/");
	}

	@Test(dataProvider = "dataSet", dataProviderClass = _02_Parameterization_DataProvider.class)
	public void TC_Facebook_Login_DataProvider(String username, String password) {

		System.out.println("Enter " + username + " in Email field");
		driver.findElement(By.id("email")).sendKeys(username);

		System.out.println("Enter " + password + " in Password field");
		driver.findElement(By.id("pass")).sendKeys(password);

		System.out.println("Clicking on Sign in button");
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();

	}

	@DataProvider(name="dataSet")
	public Object[][] dataSet() {

		// 3 rows, 2 columns
		Object[][] data = new Object[3][2];

		data[0][0] = "Email_1";
		data[0][1] = "Password_1";

		data[1][0] = "Email_2";
		data[1][1] = "Password_2";

		data[2][0] = "Email_3";
		data[2][1] = "Password_3";

		return data;
	}
}
