package _11_2_TestNG.Parameterization.Using_DataProviders_SameClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {

	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {
		System.out.println(username + "--" + password);
	}

	@DataProvider
	// Object - data can be in any format
	public Object[][] getData() {
		// 3 rows, 2 columns
		Object[][] data = new Object[3][2];

		data[0][0] = "nishant@gmail.com";
		data[0][1] = "123";

		data[1][0] = "rajat@gmail.com";
		data[1][1] = "456";

		data[2][0] = "gauty@gmail.com";
		data[2][1] = "789";

		return data;

	}
}
