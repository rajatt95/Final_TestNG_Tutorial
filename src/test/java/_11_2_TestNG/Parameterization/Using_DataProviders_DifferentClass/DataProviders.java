package _11_2_TestNG.Parameterization.Using_DataProviders_DifferentClass;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {

	// 1 DataProvider for different methods - TCs

	@DataProvider(name = "dp3")
	public static Object[][] getData(Method m) {

		Object[][] data = null;
		// loginTest3 - in class DataProvidersCallFromOtherClass
		if (m.getName().equals("loginTest3")) {
			data = new Object[2][2];
			data[0][0] = "raman";
			data[0][1] = "dsasdsfd";
			
			data[1][0] = "mohan";
			data[1][1] = "dsasdsfd";
		} else if (m.getName().equals("UserReg3")) {

			data = new Object[2][3];

			// fname, lname, email
			data[0][0] = "raman";
			data[0][1] = "sharma";
			data[0][2] = "raman@gmail.com";

			data[1][0] = "mohan";
			data[1][1] = "saini";
			data[1][2] = "mohan@gmail.com";

		}

		return data;
	}

	@DataProvider(name = "dp1")
	public static Object[][] getDataForLogin() {

		Object[][] data = new Object[2][2];

		data[0][0] = "raman";
		data[0][1] = "dsasdsfd";

		data[1][0] = "mohan";
		data[1][1] = "dsasdsfd";

		return data;
	}

	@DataProvider(name = "dp2")
	public static Object[][] getDataForUserReg() {

		Object[][] data = new Object[2][3];

		// fname, lname, email
		data[0][0] = "raman";
		data[0][1] = "sharma";
		data[0][2] = "raman@gmail.com";

		data[1][0] = "mohan";
		data[1][1] = "saini";
		data[1][2] = "mohan@gmail.com";

		return data;
	}

}
