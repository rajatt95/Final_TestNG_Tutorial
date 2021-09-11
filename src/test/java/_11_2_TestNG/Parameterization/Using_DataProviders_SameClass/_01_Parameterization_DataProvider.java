package _11_2_TestNG.Parameterization.Using_DataProviders_SameClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Parameterization_DataProvider {

	@Test(dataProvider = "getData")
	public void TC_APILogin(String uname, String pwd) {
		System.out.println("Login - RestAssured");
		System.out.println("uname: " + uname);
		System.out.println("pwd: " + pwd);
	}

	@DataProvider
	public Object[][] getData() {
		// 3 rows, 2 columns
		// 2-D Object Array
		Object[][] data = new Object[3][2];

		// 1st set
		data[0][0] = "username_1";
		data[0][1] = "password_1";

		// 2nd set
		data[1][0] = "username_2";
		data[1][1] = "password_2";

		// 3rd set
		data[2][0] = "username_3";
		data[2][1] = "password_3";

		return data;
	}
}
