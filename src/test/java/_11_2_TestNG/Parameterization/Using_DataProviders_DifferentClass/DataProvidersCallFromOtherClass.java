package _11_2_TestNG.Parameterization.Using_DataProviders_DifferentClass;

import org.testng.annotations.Test;

public class DataProvidersCallFromOtherClass {

	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp3")
	public void loginTest3(String userName, String password) {
		System.out.println(userName + "----" + password);

	}
	
	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp3")
	public void UserReg3(String fName, String lName, String email) {
		System.out.println(fName + "----" + lName + "----" + email);

	}


	
	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp1")
	public void loginTest(String userName, String password) {
		System.out.println(userName + "----" + password);

	}

	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp2")
	public void UserReg(String fName, String lName, String email) {
		System.out.println(fName + "----" + lName + "----" + email);

	}

}
